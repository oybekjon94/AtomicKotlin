package section03

fun main(){
    val list = listOf(1,2,3)
    val list1 = list.toString()
    println(list1)
    val list2 = list.joinToString()
    println(list2)
    val list3 = list.joinToString(prefix = "(", postfix = ")")
    println(list3)
    val list4 = list.joinToString(separator = "")
    println(list4)
}
