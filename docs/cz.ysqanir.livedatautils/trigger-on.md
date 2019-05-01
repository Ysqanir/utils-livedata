[livedatautils](../index.md) / [cz.ysqanir.livedatautils](index.md) / [triggerOn](./trigger-on.md)

# triggerOn

`fun <A, B> `[`ParametrizedLiveData`](../cz.ysqanir.livedatautils.triggered.manual/-parametrized-live-data/index.md)`<`[`A`](trigger-on.md#A)`, `[`B`](trigger-on.md#B)`>.triggerOn(master: LiveData<`[`A`](trigger-on.md#A)`>): `[`DependentLiveData`](../cz.ysqanir.livedatautils.triggered.manual/-dependent-live-data/index.md)`<`[`A`](trigger-on.md#A)`, `[`B`](trigger-on.md#B)`>`

Extension transforming ParametrizedLiveData to DependentLiveData by attaching it to provided master

### Parameters

`master` - controlling stream

`slave` - controlled ParametrizedLiveData, taking type of a as parameter for trigger

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

