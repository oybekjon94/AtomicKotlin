package section02

fun main(){
    val map = mapOf('a' to "attempt")
    val get0 = map['b']
    println(get0)
   // map.getValue('b') //NoSuchElementException
    val get1 = map.getOrDefault('a',"??")
    val get2 = map.getOrDefault('b',"??")
    println(get1)
    println(get2)
}