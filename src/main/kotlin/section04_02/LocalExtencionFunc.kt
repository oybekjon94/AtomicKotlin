package section04_02

fun main(){
    fun String.exclaim() = "$this"
    println("Hello".exclaim())
    println("Hallp".exclaim())
    println("Bonjour".exclaim())
}