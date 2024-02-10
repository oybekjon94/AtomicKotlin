package section03

fun checkLength(s:String?, expected:Int?){
    val length1 =
        if (s != null) s.length else null
    println(length1)
    val length2 = s?.length
    println(length2)
}
fun main(){
    checkLength("abs",3)
    checkLength(null,null)
}