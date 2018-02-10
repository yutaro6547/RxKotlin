import rx.Observable

/**
 * 空文字の場合通さない
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "dead")
    Observable.from(array)
            .filter { !it.isEmpty() }
            .subscribe({
                println(it)
            }, {})
}

