import section03.singleQuote

fun String.strangeQuote() =
    this.singleQuote() // [1]
fun main() {
    println("Hi".strangeQuote())
}