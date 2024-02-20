package lambda

data class College(
    val name:String,
    var affiliation:String,
    val city:String
)

fun main(){
    //destructuring
    val college = College("Axborot","Autonom","Toshkent")
    val (collegeName,universityAffilation,city) = college
    println("$collegeName, $universityAffilation, $city")

    //pair
    val nationalCapital:Pair<String,String> = Pair("India","New Delhi")
    val nationalCapital2:Pair<String,String> = Pair("toshkent","ozbek")
    val nationalCapital3:Pair<String,String> = Pair("yakkabog","japan")

    val printNationalCapital :(Pair<String,String>) -> Unit = {pair -> println("${pair.first}'s capital is ${pair.second}")}

    val listOfNations = listOf<Pair<String,String>>(nationalCapital,nationalCapital2,nationalCapital3)
    println(listOfNations.forEach(printNationalCapital))
}