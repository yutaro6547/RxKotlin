import rx.Observable
import java.util.concurrent.TimeUnit

/**
 * mergeで二つのobservableを合成する
 */

fun main(args: Array<String>) {
    val ob1 = Observable.interval(500L, TimeUnit.MILLISECONDS)
            .take(10)
            .map { data -> data.toString() + "A" }
    val ob2 = Observable.interval(300L, TimeUnit.MILLISECONDS)
            .take(20)
            .map { data -> data * 3 }

    Observable.merge(ob1, ob2)
            .subscribe({
                println("Merge data : " + it.toString())
            }, {})
    Thread.sleep(10000L)
}

