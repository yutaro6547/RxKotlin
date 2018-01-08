import rx.Observable

/**
 * 空文字の場合通さない
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("a", "b", "", "d")
    Observable.from(array)
            .filter { !it.isEmpty() }
            .subscribe({
                println(it)
            })
}

