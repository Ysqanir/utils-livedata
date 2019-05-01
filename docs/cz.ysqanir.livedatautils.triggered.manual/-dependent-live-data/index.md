[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.triggered.manual](../index.md) / [DependentLiveData](./index.md)

# DependentLiveData

`class DependentLiveData<A, B> : MediatorLiveData<`[`B`](index.md#B)`>`

LiveData type that watches controlling stream and triggers controlled ParametrizedLiveData on each emit.

### Parameters

`master` - controlling stream

`slave` - controlled ParametrizedLiveData, taking type of a as parameter for trigger

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

### Constructors

| [&lt;init&gt;](-init-.md) | `DependentLiveData(master: LiveData<`[`A`](index.md#A)`>, slave: `[`ParametrizedLiveData`](../-parametrized-live-data/index.md)`<`[`A`](index.md#A)`, `[`B`](index.md#B)`>)`<br>LiveData type that watches controlling stream and triggers controlled ParametrizedLiveData on each emit. |

### Extension Functions

| [conditionalDebounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/conditional-debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [debounce](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [getDistinct](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>.getDistinct(): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not |
| [getDistinctBy](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md) | `fun <T> LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?, `[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](../../cz.ysqanir.livedatautils/androidx.lifecycle.-live-data/get-distinct-by.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not |

