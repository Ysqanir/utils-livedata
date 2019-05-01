package cz.ysqanir.livedatautilsdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import cz.ysqanir.livedatautils.Combinations
import cz.ysqanir.livedatautils.filter.FilteredLiveData
import cz.ysqanir.livedatautils.triggered.activity.AutoTriggerLiveData
import cz.ysqanir.livedatautils.triggered.manual.DependentLiveData
import cz.ysqanir.livedatautils.triggered.manual.ParametrizedLiveData
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val numbers = MutableLiveData<List<Long>>()
    private var timerDisposable: Disposable? = null

    private val parametrizedLiveData = ParametrizedLiveData<Long, String>(baseValue = "Not Initialized", disposeOnInactive = false, obtainerSource = { Observable.just("item triggered at time: $it") })
    private val dependentLiveData = DependentLiveData(parametrizedLiveData, ParametrizedLiveData(baseValue = "Not Initialized", disposeOnInactive = false, obtainerSource = { Observable.just("master said $it") }))
    private val filteredLiveData = FilteredLiveData(defaultFilterValue = 0L, source = numbers, filter = { query, items -> items.filter { it % 3 == query } })

    private val autoTriggerLiveData = AutoTriggerLiveData(obtainer = Observable.just(Random.nextInt()))
    private val combined = Combinations.combineLatest(autoTriggerLiveData, numbers)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parametrizedLiveData.observe(this, Observer {
            parametrizedView.text = it
        })
        dependentLiveData.observe(this, Observer {
            dependentView.text = it
        })

        numbers.observe(this, Observer {
            nonFilteredView.text = it.joinToString()
        })
        filteredLiveData.observe(this, Observer {
            filteredView.text = "mod 3 is ${it.currentFilter}: ${it.items.joinToString()}, any item removed: ${it.filterRemovedItems}"
        })

        autoTriggerLiveData.observe(this, Observer {
            autoTriggerView.text = "obtainer returned $it, rotate screen to refresh"
        })

        combined.observe(this, Observer {
            combination.text = "combined ${it.first} with ${it.second.joinToString()}"
        })
    }

    override fun onResume() {
        super.onResume()
        timerDisposable?.dispose()
        timerDisposable = Flowable.interval(1, TimeUnit.SECONDS)
                .subscribe {
                    parametrizedLiveData.trigger(it)
                    numbers.postValue(listOf(it - 2, it - 1, it, it + 1, it + 2))
                }
    }
}
