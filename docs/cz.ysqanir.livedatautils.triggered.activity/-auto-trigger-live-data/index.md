[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.activity](../index.md) / [AutoTriggerLiveData](./index.md)

# AutoTriggerLiveData

`open class AutoTriggerLiveData<A> : LiveData<`[`A`](index.md#A)`>`

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

### Constructors

| [&lt;init&gt;](-init-.md) | `AutoTriggerLiveData(triggerOnActive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, triggerOnActiveWithValue: (`[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { true }, disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, baseValue: `[`A`](index.md#A)`? = null, obtainer: Observable<`[`A`](index.md#A)`>)`<br>LiveData type that triggers provided data obtainer when it becomes active. No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself. |

### Properties

| [disposeOnInactive](dispose-on-inactive.md) | `val disposeOnInactive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>dispose obtainer when becoming inactive |
| [obtainer](obtainer.md) | `var obtainer: Observable<`[`A`](index.md#A)`>`<br>RX Observable that returns values of expected type to use as values for this livedata instance |
| [triggerOnActive](trigger-on-active.md) | `val triggerOnActive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>true if obtainer is to be called every time the instance becomes active |
| [triggerOnActiveWithValue](trigger-on-active-with-value.md) | `val triggerOnActiveWithValue: (`[`A`](index.md#A)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if obtainer should be called on becoming active based on current value |

### Functions

| [onActive](on-active.md) | `open fun onActive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onInactive](on-inactive.md) | `open fun onInactive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [trigger](trigger.md) | `fun trigger(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Trigger obtainer to fetch new value |

### Extension Functions

| [conditionalDebounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [debounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [getDistinct](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>.getDistinct(): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not |
| [getDistinctBy](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?, `[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not |

### Inheritors

| [OpenAutoTriggerLiveData](../-open-auto-trigger-live-data/index.md) | `class OpenAutoTriggerLiveData<A> : `[`AutoTriggerLiveData`](./index.md)`<`[`A`](../-open-auto-trigger-live-data/index.md#A)`>`<br>AutoTriggerLiveData that allows external sources to post values |

