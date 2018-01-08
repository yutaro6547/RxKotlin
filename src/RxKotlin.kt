
public fun <T> emptyObservable() : Observable<T> = Observable.empty()

public fun <T> observable(body : (s : Subscriber<in T>) -> Unit) : Observable<T> = Observable.create(body)



