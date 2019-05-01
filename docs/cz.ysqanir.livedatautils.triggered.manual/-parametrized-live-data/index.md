[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.manual](../index.md) / [ParametrizedLiveData](./index.md)

# ParametrizedLiveData

`class ParametrizedLiveData<A, B> : LiveData<`[`B`](index.md#B)`>`

LiveData type that allows manual triggering of provided obtainer with parameter.
No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself.

### Parameters

`disposeOnInactive` - dispose running obtainer when becoming inactive

`baseValue` - value to initialize instance with

`obtainerSource` - method to get RX Observable that returns values of expected type to use as values for this livedata instance

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

### Constructors

| [&lt;init&gt;](-init-.md) | `ParametrizedLiveData(disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, baseValue: `[`B`](index.md#B)`? = null, obtainerSource: (parameter: `[`A`](index.md#A)`) -> Observable<`[`B`](index.md#B)`>)`<br>LiveData type that allows manual triggering of provided obtainer with parameter. No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself. |

### Properties

| [disposeOnInactive](dispose-on-inactive.md) | `val disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>dispose running obtainer when becoming inactive |
| [obtainerSource](obtainer-source.md) | `val obtainerSource: (parameter: `[`A`](index.md#A)`) -> Observable<`[`B`](index.md#B)`>`<br>method to get RX Observable that returns values of expected type to use as values for this livedata instance |

### Functions

| [onInactive](on-inactive.md) | `fun onInactive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [trigger](trigger.md) | `fun trigger(parameter: `[`A`](index.md#A)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Create obtainer with provided parameter and trigger it to fetch new value |

### Extension Functions

| [conditionalDebounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [debounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [getDistinct](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>.getDistinct(): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not |
| [getDistinctBy](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?, `[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not |
| [triggerOn](../../cz.ysqanir.livedatautils/trigger-on.md) | `fun <A, B> `[`ParametrizedLiveData`](./index.md)`<`[`A`](../../cz.ysqanir.livedatautils/trigger-on.md#A)`, `[`B`](../../cz.ysqanir.livedatautils/trigger-on.md#B)`>.triggerOn(master: LiveData<`[`A`](../../cz.ysqanir.livedatautils/trigger-on.md#A)`>): `[`DependentLiveData`](../-dependent-live-data/index.md)`<`[`A`](../../cz.ysqanir.livedatautils/trigger-on.md#A)`, `[`B`](../../cz.ysqanir.livedatautils/trigger-on.md#B)`>`<br>Extension transforming ParametrizedLiveData to DependentLiveData by attaching it to provided master |

