package cz.ysqanir.livedatautils.triggered.manual

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

/**
 * LiveData type that watches controlling stream and triggers controlled ParametrizedLiveData on each emit.
 * @see #ParametrizedLiveData
 * @param master controlling stream
 * @param slave controlled ParametrizedLiveData, taking type of a as parameter for trigger
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
class DependentLiveData<A, B>(master: LiveData<A>, slave: ParametrizedLiveData<A, B>) : MediatorLiveData<B>() {
    init {
        addSource(master) {
            if (it != null) slave.trigger(it)
        }
        addSource(slave) {
            postValue(it)
        }
    }
}