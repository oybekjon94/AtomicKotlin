package section03

class Overloading{
    fun f() = 0
    fun f(n:Int) = n + 2
}

fun main(){
    val o =Overloading()
    val o1 = o.f()
    println(o1)
    val o2 = o.f(11)
    println(o2)
}