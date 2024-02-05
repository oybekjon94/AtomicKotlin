package section02

class Counter{
    var value:Int = 0
    private set
    fun inc() = value++
}
fun main(){
    val counter = Counter()
    repeat(10){
        counter.inc()
    }
    // counter.value = 10 error set qila olmaymiz
}