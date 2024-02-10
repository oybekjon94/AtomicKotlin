package section03

fun isNullOrEmpty(s:String?):Boolean =
    s == null || s.isEmpty()

fun main(){
    println(isNullOrEmpty(null))
    println(isNullOrEmpty(""))
}