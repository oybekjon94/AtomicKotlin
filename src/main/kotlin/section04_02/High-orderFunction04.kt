package section04_02

fun main(){
    val transform:(String) -> Int? =
        {s:String -> s.toIntOrNull()}
    println(transform("112"))
    println(transform("abc"))

    val x = listOf("112","abc")
    println(x.mapNotNull(transform))
    println(x.mapNotNull{it.toIntOrNull()})
}
