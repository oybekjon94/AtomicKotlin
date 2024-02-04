package section02

fun sum(vararg number: Int):Int{
    var total = 0
    for (n in number){
        total += n
    }
    return total
}
fun main(){
    println(sum(13,27,12))
    println(sum(13,27,12,32,23))
    println(sum())
}