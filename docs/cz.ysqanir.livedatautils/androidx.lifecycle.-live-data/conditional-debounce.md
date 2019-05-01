[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [androidx.lifecycle.LiveData](index.md) / [conditionalDebounce](./conditional-debounce.md)

# conditionalDebounce

`fun <T> LiveData<`[`T`](conditional-debounce.md#T)`>.conditionalDebounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L, debounceItem: (`[`T`](conditional-debounce.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](conditional-debounce.md#T)`>`

Extension for LiveData that debounces original source by given time, limiting item emits.

### Parameters

`debounce` - time to debounce source by in milliseconds, default is 1000

`debounceItem` - function to determine if this item should be handled in usual way (debounced, returning true) or not (overriding debounce and emitting immediately, returning false)

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

