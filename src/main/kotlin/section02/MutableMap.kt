package section02

fun main(){
    val m = mutableMapOf(
        5 to "five",
        6 to "six"
    )

    m[5] = "5ive"
    m += 4 to "four"
    println(m)
}