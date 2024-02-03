package section02

fun main(){
    val ints = listOf(99,3,4,2,4,11)
    var result = ""
    for (i in ints){
        result += "$i "
    }
    println(ints)
    println(result)
    println(ints[5]) //11
}