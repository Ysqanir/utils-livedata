[livedatautils](../index.md) / [cz.ysqanir.livedatautils](index.md) / [mapData](./map-data.md)

# mapData

`fun <A, B, C> `[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`B`](map-data.md#B)`>.mapData(mapper: (it: `[`B`](map-data.md#B)`) -> `[`C`](map-data.md#C)`): `[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`C`](map-data.md#C)`>`

Extension allowing to map FilterResult items without losing attached metadata

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

`fun <A, B, C> `[`FilteredLiveData`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/index.md)`<`[`A`](map-data.md#A)`, `[`B`](map-data.md#B)`>.mapData(mapper: (it: `[`B`](map-data.md#B)`) -> `[`C`](map-data.md#C)`): LiveData<`[`FilterResult`](../cz.ysqanir.livedatautils.filter/-filtered-live-data/-filter-result/index.md)`<`[`A`](map-data.md#A)`, `[`C`](map-data.md#C)`>>`

Extension allowing to map FilterLiveData result items without losing attached metadata

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

