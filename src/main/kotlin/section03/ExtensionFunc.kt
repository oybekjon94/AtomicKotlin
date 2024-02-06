package section03

import kotlin.math.sin

fun String.singleQuote() = "'$this'"
fun String.doubleQuotes() = "\"$this\""
fun main(){
    val singleQ = "Hi".singleQuote()
    val doubleQ = "Hi".doubleQuotes()
    println(singleQ)
    println(doubleQ)
}