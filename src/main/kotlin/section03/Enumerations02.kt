package section03
import section03.Size.*
enum class Size{
    Tiny,Small,Medium,Large,Huge,Gigantic
}

fun main(){
    val gigantic = Gigantic
    println(gigantic)
    val size = Size.values().toList()
    println(size)
    val tiny = Tiny.ordinal
    val huge = Huge.ordinal
    println(tiny)
    println(huge)
}