import rx.Observable

/**
 * skipで指定した分だけ最初にスキップする
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "community", "dead")
    Observable.from(array)
            .skip(2)
            .subscribe({
                println(it)
            })
}

