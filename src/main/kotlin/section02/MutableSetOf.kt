package section02

fun main(){
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 42
    mutableSet += 42
    println(mutableSet)
    mutableSet -= 42
    println(mutableSet)
}