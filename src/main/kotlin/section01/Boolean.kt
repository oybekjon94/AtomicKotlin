package section01

fun main() = isOpen(6)
fun isOpen(hour:Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status =
        hour in open..closed
    println("Open: $status")
}