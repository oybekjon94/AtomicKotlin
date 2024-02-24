package section04_02

fun main(){
    val list = listOf(1,2,3,4,5)
    val value = 3
    var result = ""
    list.forEach tag@{
        result += "$it"
        if (it == value) return@tag
    }
    println(result)
}