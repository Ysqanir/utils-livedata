[livedatautils](../../../index.md) / [cz.ysqanir.livedatautils.filter](../../index.md) / [FilteredLiveData](../index.md) / [FilterResult](./index.md)

# FilterResult

`data class FilterResult<A, B>`

Data class wrapping current filter result

### Constructors

| [&lt;init&gt;](-init-.md) | `FilterResult(currentFilter: `[`A`](index.md#A)`, items: `[`B`](index.md#B)`, filterRemovedItems: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>Data class wrapping current filter result |

### Properties

| [currentFilter](current-filter.md) | `val currentFilter: `[`A`](index.md#A)<br>value of filter used to get this result |
| [filterRemovedItems](filter-removed-items.md) | `val filterRemovedItems: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>true if items provided by source emit changed by applying current filter |
| [items](items.md) | `val items: `[`B`](index.md#B)<br>filtered items |

### Extension Functions

| [mapData](../../../cz.ysqanir.livedatautils/map-data.md) | `fun <A, B, C> `[`FilterResult`](./index.md)`<`[`A`](../../../cz.ysqanir.livedatautils/map-data.md#A)`, `[`B`](../../../cz.ysqanir.livedatautils/map-data.md#B)`>.mapData(mapper: (it: `[`B`](../../../cz.ysqanir.livedatautils/map-data.md#B)`) -> `[`C`](../../../cz.ysqanir.livedatautils/map-data.md#C)`): `[`FilterResult`](./index.md)`<`[`A`](../../../cz.ysqanir.livedatautils/map-data.md#A)`, `[`C`](../../../cz.ysqanir.livedatautils/map-data.md#C)`>`<br>Extension allowing to map FilterResult items without losing attached metadata |

