import rx.Observable
import rx.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "dead")
    Observable.from(array)
            .observeOn(Schedulers.computation())
            .observeOn(Schedulers.io())
            .observeOn(Schedulers.immediate())
            .observeOn(Schedulers.trampoline())
            .subscribe{data ->
                val thread = Thread.currentThread().name
                println(thread + ": " + data)
            }
    Thread.sleep(1000L)
}
