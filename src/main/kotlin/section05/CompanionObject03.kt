package section05

class WithObjectProperty{
    companion object{
        private var n:Int = 0 //only one
    }
    fun increment() = ++n
}
fun main(){
    val a = WithObjectProperty()
    val b = WithObjectProperty()
    println(a.increment())
    println(b.increment())
    println(a.increment())
}