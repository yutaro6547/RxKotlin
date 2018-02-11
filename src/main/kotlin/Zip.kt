import rx.Observable
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.function.BiFunction

/**
 * zipで揃ったタイミングで新しいデータを生成する。
 */

fun main(args: Array<String>) {
    val ob1 = Observable.interval(500L, TimeUnit.MILLISECONDS)
            .take(10)
            .map { data -> data.toString() + "A" }
    val ob2 = Observable.interval(300L, TimeUnit.MILLISECONDS)
            .take(20)
            .map { data -> data * 3 }

    Observable.zip(ob1, ob2, {data1, data2 -> Arrays.asList(data1, data2)})
            .subscribe({
                println("Zip data : " + it.toString())
            }, {})
    Thread.sleep(10000L)
}

