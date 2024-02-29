package section03
import section03.Level.*
enum class Level{
    Overflow, High, Medium, Low, Empty
}

fun main(){
    val level = Level.Medium
    println(level)
    val high = High
    println(high)
    println(Empty)
}