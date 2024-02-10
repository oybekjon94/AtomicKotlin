package section03

fun String?.isNullOrEmpty():Boolean =
    this == null || isEmpty()

fun main(){
    println("".isNullOrEmpty())
}