package cz.ysqanir.livedatautils.triggered.manual

import androidx.lifecycle.LiveData
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

/**
 * LiveData type that allows manual triggering of provided obtainer with parameter.
 * No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself.
 * @param disposeOnInactive dispose running obtainer when becoming inactive
 * @param baseValue value to initialize instance with
 * @param obtainerSource method to get RX Observable that returns values of expected type to use as values for this livedata instance
 *
 * @author Vojtěch Šimša <simsavojtech1@gmail.com>
 */
class ParametrizedLiveData<B, A>(
        val disposeOnInactive: Boolean = false,
        baseValue: A? = null,
        val obtainerSource: (parameter: B) -> Observable<A>) : LiveData<A>() {
    init {
        value = baseValue
    }

    var disposables = mutableListOf<Disposable>()

    fun trigger(parameter: B) {
        clearDisposables()
        disposables.add(
                obtainerSource(parameter)
                        .subscribe(
                                { next -> postValue(next) },
                                {}))
    }

    private fun clearDisposables() {
        disposables.forEach {
            try {
                it.dispose()
            } catch (e: Exception) {
            }
        }
        disposables.clear()
    }

    override fun onInactive() {
        if (disposeOnInactive) {
            clearDisposables()
        }
        super.onInactive()
    }
}