[livedatautils](../index.md) / [cz.ysqanir.livedatautils.triggered.manual](./index.md)

## Package cz.ysqanir.livedatautils.triggered.manual

### Types

| [DependentLiveData](-dependent-live-data/index.md) | `class DependentLiveData<A, B> : MediatorLiveData<`[`B`](-dependent-live-data/index.md#B)`>`<br>LiveData type that watches controlling stream and triggers controlled ParametrizedLiveData on each emit. |
| [ParametrizedLiveData](-parametrized-live-data/index.md) | `class ParametrizedLiveData<A, B> : LiveData<`[`B`](-parametrized-live-data/index.md#B)`>`<br>LiveData type that allows manual triggering of provided obtainer with parameter. No operation is taken on errors thrown by obtainer, if any action is to be taken it must be defined by the obtainer itself. |

