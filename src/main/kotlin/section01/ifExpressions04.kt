package section01

fun main(){
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))

    val x = 1
    println(oneOrtheOther(x == 1))
}
fun trueOrFalse(exp:Boolean):String{
    if (exp)
        return "it's true"
        return "it's false"
}

//Single Expression
fun oneOrtheOther(exp:Boolean):String =
    if (exp)
        "true" //no return necessary
    else
        "False"
