package lambda

fun main(){
    val square:(Int) -> Int = {it*it}
    println(square(10))

    val cube:(Int) -> Int = {it*it*it}
    println(cube(10))
}