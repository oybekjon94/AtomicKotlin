package section04_02

val helloWorld:() -> String =
    {"Hello World"}

val sum:(Int,Int) -> Int =
    {x,y -> x+y}

fun main(){
    println(helloWorld)
    println(sum(1,2))
}