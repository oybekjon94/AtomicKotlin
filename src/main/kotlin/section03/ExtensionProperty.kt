package section03

val String.indices:IntRange
    get() = 0 until length

fun main(){
    println("abc".indices)
}