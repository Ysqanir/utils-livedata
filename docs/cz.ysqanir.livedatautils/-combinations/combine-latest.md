[livedatautils](../../index.md) / [cz.ysqanir.livedatautils](../index.md) / [Combinations](index.md) / [combineLatest](./combine-latest.md)

# combineLatest

`fun <A, B> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>): LiveData<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`A`](combine-latest.md#A)`, `[`B`](combine-latest.md#B)`>>`

Simplified version of two-stream combination, returning Pair object without further processing

### Parameters

`a` - stream of A

`b` - stream of B

**Return**
stream of Pair&lt;A,B&gt;

`fun <A, B, C> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>): LiveData<`[`Triple`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)`<`[`A`](combine-latest.md#A)`, `[`B`](combine-latest.md#B)`, `[`C`](combine-latest.md#C)`>>`

Simplified version of three-stream combination, returning Triple object without further processing

### Parameters

`a` - stream of A

`b` - stream of B

`c` - stream of C

**Return**
stream of Triple&lt;A,B,C&gt;

`fun <A, B, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`

Combine latest values of provided streams using combinator as result parser.
Will not emit anything until all source streams have emitted at least one item.

### Parameters

`a` - stream of A

`b` - stream of B

`b` - stream of C

`combinator` - :(a:A,b:B,c:C)-&gt;T logic for parsing values A,B,C to resulting type T

**Return**
stream of T as defined by combinator

`fun <A, B, C, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`

Combine latest values of provided streams using combinator as result parser.
Will not emit anything until all source streams have emitted at least one item.

### Parameters

`a` - stream of A

`b` - stream of B

`c` - stream of C

`combinator` - :(a:A,b:B,c:C)-&gt;T logic for parsing values A,B,C to resulting type T

**Return**
stream of T as defined by combinator

`fun <A, B, C, D, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, d: LiveData<`[`D`](combine-latest.md#D)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`, d: `[`D`](combine-latest.md#D)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`

Combine latest values of provided streams using combinator as result parser.
Will not emit anything until all source streams have emitted at least one item.

### Parameters

`a` - stream of A

`b` - stream of B

`c` - stream of C

`d` - stream of D

`combinator` - :(a:A,b:B,c:C,d:D)-&gt;T logic for parsing values A,B,C,D to resulting type T

**Return**
stream of T as defined by combinator

`fun <A, B, C, D, E, T> combineLatest(a: LiveData<`[`A`](combine-latest.md#A)`>, b: LiveData<`[`B`](combine-latest.md#B)`>, c: LiveData<`[`C`](combine-latest.md#C)`>, d: LiveData<`[`D`](combine-latest.md#D)`>, e: LiveData<`[`E`](combine-latest.md#E)`>, combinator: (a: `[`A`](combine-latest.md#A)`, b: `[`B`](combine-latest.md#B)`, c: `[`C`](combine-latest.md#C)`, d: `[`D`](combine-latest.md#D)`, e: `[`E`](combine-latest.md#E)`) -> `[`T`](combine-latest.md#T)`): LiveData<`[`T`](combine-latest.md#T)`>`

Combine latest values of provided streams using combinator as result parser.
Will not emit anything until all source streams have emitted at least one item.

### Parameters

`a` - stream of A

`b` - stream of B

`c` - stream of C

`d` - stream of D

`e` - stream of E

`combinator` - :(a:A,b:B,c:C,d:D,e:E)-&gt;T logic for parsing values A,B,C,D,E to resulting type T

**Return**
stream of T as defined by combinator

