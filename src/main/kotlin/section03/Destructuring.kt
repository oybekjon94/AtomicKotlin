package section03

fun compute(input: Int): Pair<Int, String> =
    if (input > 5)
        Pair(input * 2, "High")
    else
        Pair(input * 2, "Low")

fun main(){
    println(compute(7))
    println(compute(4))
    val result = compute(5)
    result.first
    result.second
    println(result)
}