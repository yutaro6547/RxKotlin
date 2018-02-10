import rx.Observable

/**
 * distinctUntilChangedで連続して重複した要素を取り除く
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "bow", "dead", "allow", "bow", "bow", "dead")
    Observable.from(array)
            .distinctUntilChanged()
            .subscribe({
                println(it)
            }, {})
}

