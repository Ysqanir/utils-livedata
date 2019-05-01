[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.filter](../index.md) / [FilteredLiveData](index.md) / [isResultEqual](./is-result-equal.md)

# isResultEqual

`protected val isResultEqual: (original: `[`B`](index.md#B)`, filtered: `[`B`](index.md#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

function to check if item emitted by source changed by applying filter. Must return true if sets are equal. Default is simple comparison.

