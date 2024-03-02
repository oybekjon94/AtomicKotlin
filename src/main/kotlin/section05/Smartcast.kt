package section05

fun main(){
    val b1:Base02 = Derived1() //upcast
    if (b1 is Derived1)
        b1.g() //within scope of "is" check
    val b2:Base02 = Derived2()
    if (b2 is Derived2)
        b2.h()
}