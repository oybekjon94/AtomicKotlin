package lambda

fun main(){
    println(add(10,20))
    println(addLambda(10,20))
    println(addLambda02(10,20))
    println(addLambda03.invoke(10,20))
}

fun add(num1:Int,num2:Int):Int{
    return num1 + num2
}

val addLambda: (Int,Int) -> Int = {a:Int,b:Int -> a+b}

//same
val addLambda02:(Int,Int) -> Int = {a,b -> a+b}

//same
val addLambda03 = {a:Int, b:Int -> a+b}