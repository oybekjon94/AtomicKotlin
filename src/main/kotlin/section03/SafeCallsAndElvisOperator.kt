package section03

fun checkLength(s:String?, expected:Int){
    val length1 =
        if (s != null) s.length else 0
    println(length1)
    val length2 = s?.length ?: 0
    println(length2)
}
fun main(){
    checkLength("abs",3)
    checkLength(null,0)
}