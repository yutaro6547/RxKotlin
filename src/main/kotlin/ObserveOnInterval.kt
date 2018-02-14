import rx.Observable
import rx.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    Observable.interval(500L, TimeUnit.MILLISECONDS)
            .take(10)
            .observeOn(Schedulers.io())
            .observeOn(Schedulers.immediate())
            .observeOn(Schedulers.trampoline())
            .subscribe{data ->
                val thread = Thread.currentThread().name
                println(thread + ": " + data)
            }
    Thread.sleep(1000L)
}
