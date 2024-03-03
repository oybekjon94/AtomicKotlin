package section05

interface Creature
class Human:Creature{
    fun greeting() = "I am Human"
}
class Dog01:Creature{
    fun bark() = "Yip!"
}
class Alien01:Creature{
    fun mobility() = "Three legs"
}
fun what(c:Creature):String =
    when(c){
        is Human -> c.greeting()
        is Dog01 -> c.bark()
        is Alien01 -> c.mobility()
        else -> "Something else"
    }
fun main(){
    val c:Creature = Human()
    println(what(c))
    println(what(Dog01()))
    println(what(Alien01()))
    class Who:Creature
    println(what(Who()))
}