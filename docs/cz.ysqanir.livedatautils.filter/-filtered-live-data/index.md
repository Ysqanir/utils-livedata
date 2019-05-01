[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.filter](../index.md) / [FilteredLiveData](./index.md)

# FilteredLiveData

`class FilteredLiveData<A, B> : MediatorLiveData<`[`FilterResult`](-filter-result/index.md)`<`[`A`](index.md#A)`, `[`B`](index.md#B)`>>`

LiveData type that emits items from provided source filtered by provided filter logic

### Parameters

`defaultFilterValue` - default value for the filter, representing "no filter applied"

`source` - source stream of items

`filter` - function to perform on each item emitted by source with current filter value and corresponding source item as params

`isResultEqual` - function to check if item emitted by source changed by applying filter. Must return true if sets are equal. Default is simple comparison.

`isFilterEqual` - function to check if provided filter values are the same, used to determine if any filter is applied (current filter value is not equal to default). Default is simple comparison.

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

### Types

| [FilterResult](-filter-result/index.md) | `data class FilterResult<A, B>`<br>Data class wrapping current filter result |

### Constructors

| [&lt;init&gt;](-init-.md) | `FilteredLiveData(defaultFilterValue: `[`A`](index.md#A)`, source: LiveData<`[`B`](index.md#B)`>, filter: (a: `[`A`](index.md#A)`, b: `[`B`](index.md#B)`) -> `[`B`](index.md#B)`, isResultEqual: (original: `[`B`](index.md#B)`, filtered: `[`B`](index.md#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { a, b -> a == b }, isFilterEqual: (a: `[`A`](index.md#A)`?, b: `[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { a, b -> a == b })`<br>LiveData type that emits items from provided source filtered by provided filter logic |

### Properties

| [defaultFilterValue](default-filter-value.md) | `val defaultFilterValue: `[`A`](index.md#A)<br>default value for the filter, representing "no filter applied" |
| [filter](filter.md) | `val filter: (a: `[`A`](index.md#A)`, b: `[`B`](index.md#B)`) -> `[`B`](index.md#B)<br>function to perform on each item emitted by source with current filter value and corresponding source item as params |
| [isFilterEqual](is-filter-equal.md) | `val isFilterEqual: (a: `[`A`](index.md#A)`?, b: `[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>function to check if provided filter values are the same, used to determine if any filter is applied (current filter value is not equal to default). Default is simple comparison. |
| [isResultEqual](is-result-equal.md) | `val isResultEqual: (original: `[`B`](index.md#B)`, filtered: `[`B`](index.md#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>function to check if item emitted by source changed by applying filter. Must return true if sets are equal. Default is simple comparison. |

### Functions

| [initFilter](init-filter.md) | `fun initFilter(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set filter back to initial state and emit last source item with applied default filter |
| [isFilterApplied](is-filter-applied.md) | `fun isFilterApplied(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if current filter is different from default |
| [updateFilter](update-filter.md) | `fun updateFilter(newFilter: `[`A`](index.md#A)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Update current filter and apply it to last source item, emitting new item with current filter |

### Extension Functions

| [conditionalDebounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [debounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [getDistinct](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>.getDistinct(): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not |
| [getDistinctBy](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?, `[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not |
| [mapData](../../cz.ysqanir.livedatautils/map-data.md) | `fun <A, B, C> `[`FilteredLiveData`](./index.md)`<`[`A`](../../cz.ysqanir.livedatautils/map-data.md#A)`, `[`B`](../../cz.ysqanir.livedatautils/map-data.md#B)`>.mapData(mapper: (it: `[`B`](../../cz.ysqanir.livedatautils/map-data.md#B)`) -> `[`C`](../../cz.ysqanir.livedatautils/map-data.md#C)`): LiveData<`[`FilterResult`](-filter-result/index.md)`<`[`A`](../../cz.ysqanir.livedatautils/map-data.md#A)`, `[`C`](../../cz.ysqanir.livedatautils/map-data.md#C)`>>`<br>Extension allowing to map FilterLiveData result items without losing attached metadata |

