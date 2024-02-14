package section04

fun main(){
    val list = listOf(1,5,7,10)
    val divider = 5
    println(list.filter { it % divider == 0 })

    //modify
    val dividerr = 5
    println(list.filter { it % dividerr == 0 }
        .sum())
}