[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [androidx.lifecycle.LiveData](index.md) / [debounce](./debounce.md)

# debounce

`fun <T> LiveData<`[`T`](debounce.md#T)`>.debounce(debounce: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 1000L): LiveData<`[`T`](debounce.md#T)`>`

Extension for LiveData that debounces original source by given time, limiting item emits.

### Parameters

`debounce` - time to debounce source by in milliseconds, default is 1000

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

