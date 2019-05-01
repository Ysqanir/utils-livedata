[livedatautils](../index.md) / [cz.ysqanir.livedatautils.triggered.activity](./index.md)

## Package cz.ysqanir.livedatautils.triggered.activity

### Types

| [AutoTriggerLiveData](-auto-trigger-live-data/index.md) | `open class AutoTriggerLiveData<A> : LiveData<`[`A`](-auto-trigger-live-data/index.md#A)`>`<br>LiveData type that triggers provided data obtainer when it becomes active. No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself. |
| [OpenAutoTriggerLiveData](-open-auto-trigger-live-data/index.md) | `class OpenAutoTriggerLiveData<A> : `[`AutoTriggerLiveData`](-auto-trigger-live-data/index.md)`<`[`A`](-open-auto-trigger-live-data/index.md#A)`>`<br>AutoTriggerLiveData that allows external sources to post values |

