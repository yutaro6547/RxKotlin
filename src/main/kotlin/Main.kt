import org.apache.commons.lang3.StringUtils
import rx.Observable

fun <T> Observable<T>.filterNotEmpty(): Observable<T> = filter {
    when (it) {
        is String -> !StringUtils.isEmpty(it)
        is List<*> -> it.count() > 0
        else -> it != null
    }
}

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("allow", "bow", "", "deep")
    var result: Array<String>? = null
    Observable.from(array)
            .filterNotEmpty()
            .subscribe({
                result = array
            })
    for (i in result?.indices!!) {
        println(message = result!![i])
    }
}

