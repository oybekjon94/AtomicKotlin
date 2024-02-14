package section04

fun createPair() = Pair(1,"one")

fun main(){
    val (i , s) = createPair()
    println(listOf(i,s))
}