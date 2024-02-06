package section03

fun main(){
    val list = listOf(1,2,3)
    val list1 = list.joinToString(". ","","!")
    println(list1)
    val list2 = list.joinToString(separator = ". ",
        postfix = "!")
    println(list2)
}