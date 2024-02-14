package section04

fun main(){
    val list = listOf('a','b','c','X','Z')
    println(list.takeLast(3))
    println(list.takeLastWhile { it.isUpperCase() })
    println(list.drop(1))
    println(list.dropWhile { it.isLowerCase() })

    //sets
    val set = setOf("a","ab","ac")
    println(set.maxByOrNull { it.length }?.length)
    println(set.filter {
        it.contains('b')
    })
    println(set.map { it.length })
}