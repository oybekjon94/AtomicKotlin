package section03

fun mixColors(first:String,second:String) =
    when(setOf(first,second)){
        setOf("red", "blue") -> "purple"
        setOf("red","yellow") -> "orange"
        setOf("blue","yellow") -> "green"
        else -> "unknown"
    }
fun main(){
    mixColors("red","blue")
    mixColors("blue","red")
    mixColors("blue","purple")
}