[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [androidx.lifecycle.LiveData](index.md) / [getDistinctBy](./get-distinct-by.md)

# getDistinctBy

`fun <T> LiveData<`[`T`](get-distinct-by.md#T)`>.getDistinctBy(isDistinct: (`[`T`](get-distinct-by.md#T)`?, `[`T`](get-distinct-by.md#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): LiveData<`[`T`](get-distinct-by.md#T)`>`

Extension for LiveData that limits source emits to distinct only, using provided isDistinct function to determine if item is distinct or not

### Parameters

`isDistinct` - function to determine if provided item is distinct from current value

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

