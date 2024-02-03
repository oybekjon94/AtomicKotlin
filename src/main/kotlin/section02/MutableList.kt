package section02

fun main(){
    val list = mutableListOf<Int>()
    list.add(1)
    list.addAll(listOf(2,3))

    list += 4
    list += listOf(5,6)
    println(list)
}