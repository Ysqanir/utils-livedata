[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.filter](../index.md) / [FilteredLiveData](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FilteredLiveData(defaultFilterValue: `[`A`](index.md#A)`, source: LiveData<`[`B`](index.md#B)`>, filter: (a: `[`A`](index.md#A)`, b: `[`B`](index.md#B)`) -> `[`B`](index.md#B)`, isResultEqual: (original: `[`B`](index.md#B)`, filtered: `[`B`](index.md#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { a, b -> a == b }, isFilterEqual: (a: `[`A`](index.md#A)`?, b: `[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { a, b -> a == b })`

LiveData type that emits items from provided source filtered by provided filter logic

### Parameters

`defaultFilterValue` - default value for the filter, representing "no filter applied"

`source` - source stream of items

`filter` - function to perform on each item emitted by source with current filter value and corresponding source item as params

`isResultEqual` - function to check if item emitted by source changed by applying filter. Must return true if sets are equal. Default is simple comparison.

`isFilterEqual` - function to check if provided filter values are the same, used to determine if any filter is applied (current filter value is not equal to default). Default is simple comparison.

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

