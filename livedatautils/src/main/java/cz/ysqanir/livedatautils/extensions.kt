package cz.ysqanir.livedatautils

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import cz.ysqanir.livedatautils.filter.FilteredLiveData
import cz.ysqanir.livedatautils.triggered.manual.DependentLiveData
import cz.ysqanir.livedatautils.triggered.manual.ParametrizedLiveData

/**
 * Extension for LiveData that debounces original source by given time, limiting item emits.
 * @param debounce time to debounce source by in milliseconds, default is 1000
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <T> LiveData<T>.debounce(debounce: Long = 1000L): LiveData<T> =
        MediatorLiveData<T>().also { output ->
            val source = this
            val handler = Handler(Looper.getMainLooper())

            val runnable = Runnable {
                output.value = source.value
            }

            output.addSource(source) {
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, debounce)
            }
        }

/**
 * Extension for LiveData that debounces original source by given time, limiting item emits.
 * @param debounce time to debounce source by in milliseconds, default is 1000
 * @param debounceItem function to determine if this item should be handled in usual way (debounced, returning true) or not (overriding debounce and emitting immediately, returning false)
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <T> LiveData<T>.conditionalDebounce(debounce: Long = 1000L,
                                        debounceItem: (T) -> Boolean): LiveData<T> =
        MediatorLiveData<T>().also { output ->
            val source = this
            val handler = Handler(Looper.getMainLooper())

            val runnable = Runnable {
                output.value = source.value
            }

            output.addSource(source) {
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, if (debounceItem(it)) debounce else 0)
            }
        }

/**
 * Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not
 * @param isDistinct function to determine if provided item is distinct from current value
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <T> LiveData<T>.getDistinctBy(isDistinct: (T?, T?) -> Boolean): LiveData<T> =
        MediatorLiveData<T>().also {
            it.addSource(this, object : Observer<T> {
                private var initialized = false
                private var lastObj: T? = null

                override fun onChanged(obj: T?) {
                    if (!initialized) {
                        initialized = true
                        lastObj = obj
                        it.postValue(lastObj)
                    } else if ((obj == null && lastObj != null) || isDistinct.invoke(obj, lastObj)) {
                        lastObj = obj
                        it.postValue(lastObj)
                    }
                }
            })
        }

/**
 * Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <T> LiveData<T>.getDistinct(): LiveData<T> = this.getDistinctBy { a, b -> a != b }

/**
 * Extension allowing to map FilterResult items without losing attached metadata
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <A, B, C> FilteredLiveData.FilterResult<A, B>.mapData(mapper: (it: B) -> C) =
        FilteredLiveData.FilterResult(currentFilter, mapper.invoke(items), filterRemovedItems)

/**
 * Extension allowing to map FilterLiveData result items without losing attached metadata
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <A, B, C> FilteredLiveData<A, B>.mapData(mapper: (it: B) -> C) =
        Transformations.map(this) { it.mapData(mapper) }

/**
 * Extension transforming ParametrizedLiveData to DependentLiveData by attaching it to provided master
 * @see #ParametrizedLiveData
 * @param master controlling stream
 * @param slave controlled ParametrizedLiveData, taking type of a as parameter for trigger
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
fun <A, B> ParametrizedLiveData<A, B>.triggerOn(master: LiveData<A>) = DependentLiveData(master, this)