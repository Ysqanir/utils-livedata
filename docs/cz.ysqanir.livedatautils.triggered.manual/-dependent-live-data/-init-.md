[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.manual](../index.md) / [DependentLiveData](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`DependentLiveData(master: LiveData<`[`A`](index.md#A)`>, slave: `[`ParametrizedLiveData`](../-parametrized-live-data/index.md)`<`[`A`](index.md#A)`, `[`B`](index.md#B)`>)`

LiveData type that watches controlling stream and triggers controlled ParametrizedLiveData on each emit.

### Parameters

`master` - controlling stream

`slave` - controlled ParametrizedLiveData, taking type of a as parameter for trigger

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

