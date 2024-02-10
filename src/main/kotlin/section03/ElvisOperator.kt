package section03

fun main(){
    val s1:String? = "abc"
    val test1 = (s1 ?: "---")
    println(test1)

    val s2:String? = null
    val test2 = (s2 ?: "---")
    println(test2)
}