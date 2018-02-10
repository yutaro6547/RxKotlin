import rx.Observable
import java.time.LocalTime
import java.util.concurrent.TimeUnit

/**
 * throttleFirstでは指定した期間は他のデータを通さない
 */

fun main(args: Array<String>) {
    Observable.interval(500L, TimeUnit.MILLISECONDS)
            .throttleFirst(1000L, TimeUnit.MILLISECONDS)
            .subscribe({
                val time = LocalTime.now()
                println("time: " + time + ", data: " + it.toString())
            }, {})
    Thread.sleep(10000L)
}

