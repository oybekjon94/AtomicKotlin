package section02

fun main(){
    val list = listOf(3,3,2,1,2)
    val list01 = list.toSet()
    println(list01) //1, 2, 3
    val list02 = list.distinct()
    println(list02) //3, 2, 1
    val stringlist = "abbcc".toSet()
    println(stringlist) //'a', 'b', 'c'
}
