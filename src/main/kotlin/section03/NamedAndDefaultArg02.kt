package section03

fun color02(
    red:Int = 0,
    green:Int = 0,
    blue:Int = 0
) = "($red, $green, $blue)"

fun main(){
    println(color02(139))
    println(color02(blue = 139))
    println(color02(255,165))
    println(color02(red = 128, blue = 128))
}
