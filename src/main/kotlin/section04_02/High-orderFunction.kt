package section04_02

val isPlus:(Int) -> Boolean = {it > 0}

fun main(){
    println(listOf(1,2,-3).any(isPlus))
}