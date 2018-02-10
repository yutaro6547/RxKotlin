import rx.Observable

/**
 * elementAtで指定したインデックスの値のみを出力する
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "community", "dead")
    Observable.from(array)
            .elementAt(2)
            .subscribe({
                println(it)
            }, {})
}

