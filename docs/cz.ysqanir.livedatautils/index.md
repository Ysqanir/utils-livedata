[livedatautils](../index.md) / [cz.ysqanir.livedatautils](./index.md)

## Package cz.ysqanir.livedatautils

### Types

| [Combinations](-combinations/index.md) | `class Combinations`<br>Collection of combination utils for LiveData |

### Extensions for External Classes

| [androidx.lifecycle.LiveData](androidx.lifecycle.-live-data/index.md) |  |

### Functions

| [mapData](map-data.md) | `fun <A, B, C> `[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`B`](map-data.md#B)`>.mapData(mapper: (it: `[`B`](map-data.md#B)`) -> `[`C`](map-data.md#C)`): `[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`C`](map-data.md#C)`>`<br>Extension allowing to map FilterResult items without losing attached metadata`fun <A, B, C> `[`FilteredLiveData`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/index.md)`<`[`A`](map-data.md#A)`, `[`B`](map-data.md#B)`>.mapData(mapper: (it: `[`B`](map-data.md#B)`) -> `[`C`](map-data.md#C)`): LiveData<`[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`C`](map-data.md#C)`>>`<br>Extension allowing to map FilterLiveData result items without losing attached metadata |
| [triggerOn](trigger-on.md) | `fun <A, B> `[`ParametrizedLiveData`](../cz.ysqanir.livedatautils.triggered.manual/-parametrized-live-data/index.md)`<`[`A`](trigger-on.md#A)`, `[`B`](trigger-on.md#B)`>.triggerOn(master: LiveData<`[`A`](trigger-on.md#A)`>): `[`DependentLiveData`](../cz.ysqanir.livedatautils.triggered.manual/-dependent-live-data/index.md)`<`[`A`](trigger-on.md#A)`, `[`B`](trigger-on.md#B)`>`<br>Extension transforming ParametrizedLiveData to DependentLiveData by attaching it to provided master |

