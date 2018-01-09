import rx.Observable

/**
 * distinctで重複した要素を取り除く
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "bow", "dead")
    Observable.from(array)
            .distinct()
            .subscribe({
                println(it)
            })
}

