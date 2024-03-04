package section05

object JustOne{
    val n = 2
    fun f() = n * 10
    fun g() = this.n * 20
}
fun main(){
    // val x = JustOne() // Error
    println(JustOne.n)
    println(JustOne.f())
    println(JustOne.g())
}