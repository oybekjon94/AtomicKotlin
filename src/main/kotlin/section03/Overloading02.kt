package section03

class My{
    fun foo() = 0
}
fun My.foo() = 1

fun My.foo(i:Int) = i + 2

fun main(){
    My().foo()
    My().foo(1)
}