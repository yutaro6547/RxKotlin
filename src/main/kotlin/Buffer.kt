import rx.Observable

/**
 * bufferで3件ごとにまとめて通知する
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "community", "dead", "easy", "face", "guard", "hint")
    Observable.from(array)
            .buffer(3)
            .subscribe({
                println(it)
            }, {})
}

