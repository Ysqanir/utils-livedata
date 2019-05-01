package cz.ysqanir.livedatautils.triggered.activity

import androidx.lifecycle.LiveData
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

/**
 * LiveData type that triggers provided data obtainer when it becomes active.
 * No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself.
 * @param triggerOnActive true if obtainer is to be called every time the instance becomes active
 * @param triggerOnActiveWithValue check if obtainer should be called on becoming active based on current value
 * @param disposeOnInactive dispose obtainer when becoming inactive
 * @param baseValue value to initialize instance with
 * @param obtainer RX Observable that returns values of expected type to use as values for this livedata instance
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
open class AutoTriggerLiveData<A>(
        protected val triggerOnActive: Boolean = true,
        protected val triggerOnActiveWithValue: ((A?) -> Boolean) = { true },
        protected val disposeOnInactive: Boolean = false,
        baseValue: A? = null,
        protected var obtainer: Observable<A>) : LiveData<A>() {
    init {
        value = baseValue
    }

    private var disposable: Disposable? = null

    /**
     * Trigger obtainer to fetch new value
     */
    fun trigger() {
        try {
            disposable?.dispose()
        } catch (e: Exception) {
        }
        disposable = obtainer.subscribe(
                { next -> postValue(next) },
                { }, //no-op
                { disposable = null })
    }

    override fun onActive() {
        super.onActive()
        if (triggerOnActive || triggerOnActiveWithValue(value)) {
            trigger()
        }
    }

    override fun onInactive() {
        if (disposeOnInactive) {
            try {
                disposable?.dispose()
                disposable = null
            } catch (e: Exception) {
                //no-op, expecting invalid state on already finished,...
            }
        }
        super.onInactive()
    }
}