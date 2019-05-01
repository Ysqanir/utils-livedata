[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [androidx.lifecycle.LiveData](./index.md)

### Extensions for androidx.lifecycle.LiveData

| [conditionalDebounce](conditional-debounce.md) | `fun <T> LiveData<`[`T`](conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](conditional-debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [debounce](debounce.md) | `fun <T> LiveData<`[`T`](debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](debounce.md#T)`>`<br>Extension for LiveData that debounces original source by given time, limiting item emits. |
| [getDistinct](get-distinct.md) | `fun <T> LiveData<`[`T`](get-distinct.md#T)`>.getDistinct(): LiveData<`[`T`](get-distinct.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using basic comparison to determine if item is distinct or not |
| [getDistinctBy](get-distinct-by.md) | `fun <T> LiveData<`[`T`](get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](get-distinct-by.md#T)`?, `[`T`](get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](get-distinct-by.md#T)`>`<br>Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not |

