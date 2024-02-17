package section04_02

fun main(){
    val left = listOf("a","b","c")
    val rigt = listOf("q","r","s")

    println(left.zip(rigt))
    println(left.zip(0..3))
    val zips = (10..100).zip(rigt)
    println(zips)
}