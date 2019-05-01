[livedatautils](../../index.md) / [cz.ysqanir.livedatautils.filter](../index.md) / [FilteredLiveData](index.md) / [updateFilter](./update-filter.md)

# updateFilter

`fun updateFilter(newFilter: `[`A`](index.md#A)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Update current filter and apply it to last source item, emitting new item with current filter

### Parameters

`newFilter` - new filter value. Null is interpreted as default value provided on instance creation.