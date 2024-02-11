package section03

fun <T> identity(arg:T):T = arg

fun main(){
    val identity1 = identity("Yellow")
    println(identity1)
    val identity2 = identity(1)
    println(identity2)
    val d:Dog = identity(Dog())
    println(d.bark())
}