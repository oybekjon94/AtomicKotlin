package section03

val String.indices:IntRange
    get() = 2 .. length

fun main(){
    println("abc".indices)
}