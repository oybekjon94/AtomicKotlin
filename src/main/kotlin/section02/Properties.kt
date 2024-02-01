package section02

class Cup{
    var persentFull = 0
}
fun main(){
    val c1 = Cup()
    c1.persentFull = 20
    val c2 = Cup()
    c2.persentFull = 100
    println(c1.persentFull)
    println(c2.persentFull)
}
