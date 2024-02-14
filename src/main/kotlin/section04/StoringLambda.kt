package section04

fun main(){
    val list = listOf(1,2,3,4)
    val isEven = {e:Int -> e % 2 == 0}
    println(list.filter(isEven))
    println(list.any(isEven))
}