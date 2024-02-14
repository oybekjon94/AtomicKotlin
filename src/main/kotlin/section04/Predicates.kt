package section04

fun main(){
    val list = listOf(-3,-1,5,7,10)
    println(list.filter { it > 0 })
    println(list.count{ it > 0 })
    println(list.find { it > 0 })
    println(list.firstOrNull { it > 0 })
    println(list.lastOrNull { it > 0 })
    println(list.any { it > 0 })
    println(list.any { it != 0 })
    println(list.all { it > 0 })
    println(list.all { it != 0 })
    println(list.none { it > 0 })
    println(list.none { it == 0 })
}