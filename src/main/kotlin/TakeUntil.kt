import rx.Observable

/**
 * takeUntilで指定した条件になるまで取ってくるようにする
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "dead",  "easy", "face", "guard", "hint")
    Observable.from(array)
            .takeUntil{ data -> data == "face" }
            .subscribe({
                println(it)
            }, {})
}

