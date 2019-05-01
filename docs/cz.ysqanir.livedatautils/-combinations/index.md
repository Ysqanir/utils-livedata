[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [Combinations](./index.md)

# Combinations

`class Combinations`

Collection of combination utils for LiveData

**Author**
Vojtěch Šimša - simsavojtech1@gmail.com

### Constructors

| [&lt;init&gt;](-init-.md) | `Combinations()`<br>Collection of combination utils for LiveData |

### Companion Object Functions

| [combineLatest](combine-latest.md) | `fun <A, B> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>): LiveData<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`A`](combine-latest.md#A)`, `[`B`](combine-latest.md#B)`>>`<br>Simplified version of two-stream combination, returning Pair object without further processing`fun <A, B, C> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>): LiveData<`[`Triple`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)`<`[`A`](combine-latest.md#A)`, `[`B`](combine-latest.md#B)`, `[`C`](combine-latest.md#C)`>>`<br>Simplified version of three-stream combination, returning Triple object without further processing`fun <A, B, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`<br>`fun <A, B, C, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`<br>`fun <A, B, C, D, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, d: LiveData<`[`D`](combine-latest.md#D)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`, d: `[`D`](combine-latest.md#D)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`<br>`fun <A, B, C, D, E, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, d: LiveData<`[`D`](combine-latest.md#D)`>, e: LiveData<`[`E`](combine-latest.md#E)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`, d: `[`D`](combine-latest.md#D)`, e: `[`E`](combine-latest.md#E)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`<br>Combine latest values of provided streams using combinator as result parser. Will not emit anything until all source streams have emitted at least one item. |
| [lastValue](last-value.md) | `fun <T> lastValue(vararg source: LiveData<`[`T`](last-value.md#T)`>): LiveData<`[`T`](last-value.md#T)`>`<br>Combine provided streams, emitting latest value |

