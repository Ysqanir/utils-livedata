package cz.ysqanir.livedatautils.filter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import cz.ysqanir.livedatautils.Combinations
import cz.ysqanir.livedatautils.getDistinct

/**
 * LiveData type that emits items from provided source filtered by provided filter logic
 * @param defaultFilterValue default value for the filter, representing "no filter applied"
 * @param source source stream of items
 * @param filter function to perform on each item emitted by source with current filter value and corresponding source item as params
 * @param isResultEqual function to check if item emitted by source changed by applying filter. Must return true if sets are equal. Default is simple comparison.
 * @param isFilterEqual function to check if provided filter values are the same, used to determine if any filter is applied (current filter value is not equal to default). Default is simple comparison.

 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
class FilteredLiveData<A, B>(
        protected val defaultFilterValue: A,
        source: LiveData<B>,
        protected val filter: ((a: A, b: B) -> B),
        protected val isResultEqual: (original: B, filtered: B) -> Boolean = { a, b -> a == b },
        protected val isFilterEqual: ((a: A?, b: A?) -> Boolean) = { a, b -> a == b }
) : MediatorLiveData<FilteredLiveData.FilterResult<A, B>>() {
    /**
     * Data class wrapping current filter result
     * @property currentFilter value of filter used to get this result
     * @property items filtered items
     * @property filterRemovedItems true if items provided by source emit changed by applying current filter
     */
    data class FilterResult<A, B>(val currentFilter: A, val items: B, val filterRemovedItems: Boolean)

    private val currentQuery = MutableLiveData<A>().apply { postValue(defaultFilterValue) }

    init {
        addSource(
                Transformations.map(
                        Combinations.combineLatest(
                                currentQuery.getDistinct(),
                                source
                        )
                ) {
                    filter(it.first, it.second)
                            .let { filtered ->
                                FilterResult(it.first, filtered, !isResultEqual(it.second, filtered))
                            }
                })
        { postValue(it) }
    }

    /**
     * Update current filter and apply it to last source item, emitting new item with current filter
     * @param newFilter new filter value. Null is interpreted as default value provided on instance creation.
     */
    fun updateFilter(newFilter: A?) = currentQuery.postValue(newFilter ?: defaultFilterValue)

    /**
     * Set filter back to initial state and emit last source item with applied default filter
     */
    fun initFilter() = updateFilter(null)

    /**
     * Check if current filter is different from default
     */
    fun isFilterApplied() = !isFilterEqual(currentQuery.value, defaultFilterValue)
}