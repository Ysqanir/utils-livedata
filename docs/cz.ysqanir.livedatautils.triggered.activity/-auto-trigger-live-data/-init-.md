[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.activity](../index.md) / [AutoTriggerLiveData](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`AutoTriggerLiveData(triggerOnActive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, triggerOnActiveWithValue: (`[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { true }, disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, baseValue: `[`A`](index.md#A)`? = null, obtainer: Observable<`[`A`](index.md#A)`>)`

LiveData type that triggers provided data obtainer when it becomes active.
No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself.

### Parameters

`triggerOnActive` - true if obtainer is to be called every time the instance becomes active

`triggerOnActiveWithValue` - check if obtainer should be called on becoming active based on current value

`disposeOnInactive` - dispose obtainer when becoming inactive

`baseValue` - value to initialize instance with

`obtainer` - RX Observable that returns values of expected type to use as values for this livedata instance

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

