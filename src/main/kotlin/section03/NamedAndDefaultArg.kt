package section03

fun color(red:Int, green:Int, blue:Int) =
    "($red, $green, $blue)"

fun main(){
    val color1 = color(1,2,3)
    val color2 = color(
        green = 76,
        red = 86,
        blue = 0
    )

    println(color1)
    println(color2)
}