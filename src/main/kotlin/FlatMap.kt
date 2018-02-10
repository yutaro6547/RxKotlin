import rx.Observable

/**
 * mapで文字列の長さに変換する
 */

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "dead")
    Observable.from(array)
            .flatMap { i -> if (i == "bow") Observable.just("fuck") else Observable.just(i.length)}
            .subscribe({
                println(it)
            }, {})
}

