package section05

sealed class Transport02

data class Train02(
    val line:String
):Transport02()

data class Bus02(
    val number:String,
    val capacity:Int
):Transport02()

fun travel02(transport: Transport02) =
    when(transport){
        is Train02 -> "Train ${transport.line}"
        is Bus02 -> "Bus ${transport.number}: " +
                "size ${transport.capacity}"
    }
fun main(){
    println(listOf(Train02("S1"),Bus02("11",90))
        .map(::travel02))
}