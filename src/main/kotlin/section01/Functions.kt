package section01

fun main(){
    val r = multiplyByTwo(5)
    println(r)
}
fun multiplyByTwo(x:Int):Int{
    println("Inside multiplyByTwo")
    return x * 2
}