package section03

val List<*>.indeces:IntRange
    get() = 0 until size
fun main(){
    println(listOf(1).indeces)
    println(listOf('a','b','c','d').indeces)
    println(emptyList<Int>())
}
