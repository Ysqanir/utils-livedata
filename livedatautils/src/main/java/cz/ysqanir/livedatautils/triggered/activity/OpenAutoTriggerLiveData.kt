package cz.ysqanir.livedatautils.triggered.activity

import io.reactivex.Observable

/**
 * AutoTriggerLiveData that allows external sources to post values
 * @see #TriggerLiveData
 *
 * @author Vojtěch Šimša <simsavojtech1@gmail.com>
 */
class OpenAutoTriggerLiveData<A>(triggerOnActive: Boolean = true,
                                 triggerOnActiveWithValue: ((A?) -> Boolean) = { true },
                                 disposeOnInactive: Boolean = false,
                                 baseValue: A? = null,
                                 obtainer: Observable<A>) : AutoTriggerLiveData<A>(triggerOnActive, triggerOnActiveWithValue, disposeOnInactive, baseValue, obtainer) {
    /**
     * Post itema as value, without any impact on currently running obtainer logic etc.
     * @param it item to be accepted as value
     */
    fun overrideValue(it: A) = postValue(it)
}