package section05

interface Player{
    val symbol:Char
}

class Food:Player{
    override val symbol = '.'
}

class Robot:Player{
    override val symbol: Char
        get() = 'R'
}
class Wall(override val symbol:Char):Player

fun main(){
    println(listOf(Food(),Robot(),Wall('|')).map {
        it.symbol
    })
}