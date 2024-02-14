package section04

fun main(){
    val list = listOf(1,2,3,4)
    val even = list.filter { it % 2 == 0 }
    val greaterThan2 = list.filter { it > 2 }
    println(even)
    println(greaterThan2)
}