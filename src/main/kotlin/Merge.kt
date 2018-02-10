import rx.Observable

/**
 * mergeで二つのobservableを合成する
 */

fun main(args: Array<String>) {
    val array1: Array<String> = arrayOf("allow", "bow", "", "dead")
    val array2: Array<String> = arrayOf("element", "follow", "god", "heap")
    Observable.merge(Observable.from(array1), Observable.from(array2))
            .subscribe({
                println(it)
            }, {})
}

