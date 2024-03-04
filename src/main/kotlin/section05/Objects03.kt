package section05

object Shared{
    var i:Int = 0
}
//We can now use Shared in a different package:
fun f(){
    Shared.i += 5
}
//And within a third package:
fun g(){
    Shared.i += 7
}
fun main(){
    println(f())
    println(g())
    println(Shared.i)
}