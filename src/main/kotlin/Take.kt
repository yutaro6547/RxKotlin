import rx.Observable

/**
 * takeで指定した分だけ取ってくるようにする
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "dead")
    Observable.from(array)
            .take(2)
            .subscribe({
                println(it)
            }, {})
}

