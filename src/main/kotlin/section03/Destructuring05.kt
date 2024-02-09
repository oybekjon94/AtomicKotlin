package section03

fun main(){
    var result = ""
    val map = mapOf(1 to "one",2 to "two")
    for ((key,value) in map){
        result += "$key = $value, "
    }
    println(result)

    var result02 = ""
    val listOfPairs =
        listOf(Pair(1,"one"),Pair(2,"two"))
    for ((i,s) in listOfPairs){
        result02 += "($i, $s)"
    }
    println(result02)
}