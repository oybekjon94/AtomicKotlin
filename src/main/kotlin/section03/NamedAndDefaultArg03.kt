package section03

class Color(
    val red:Int = 0,
    val green:Int = 0,
    val blue:Int = 0
){
    override fun toString() =
        "($red, $green, $blue)"
}

fun main(){
    val color = Color(red = 77)
    println(color)
}
