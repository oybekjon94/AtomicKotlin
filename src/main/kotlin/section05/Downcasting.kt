package section05

interface Base02{
    fun f()
}
class Derived1:Base02{
    override fun f() {}
    fun g(){}
}
class Derived2:Base02{
    override fun f() {}
    fun h(){}
}
fun main(){
    val b1:Base02 = Derived1() //upcast
    b1.f() //part of Base
    //b1.g() //not part of Base
    val b2:Base02 = Derived2() //upcast
    b2.f() //part of Base
    //b3.g() //not part of Base
}