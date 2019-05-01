[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.manual](../index.md) / [ParametrizedLiveData](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ParametrizedLiveData(disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, baseValue: `[`B`](index.md#B)`? = null, obtainerSource: (parameter: `[`A`](index.md#A)`) -> Observable<`[`B`](index.md#B)`>)`

LiveData type that allows manual triggering of provided obtainer with parameter.
No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself.

### Parameters

`disposeOnInactive` - dispose running obtainer when becoming inactive

`baseValue` - value to initialize instance with

`obtainerSource` - method to get RX Observable that returns values of expected type to use as values for this livedata instance

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

