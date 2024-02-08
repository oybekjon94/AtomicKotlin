package section03
import section03.Direction.*
enum class Direction(val notation:String){
    North("N"),South("S"),
    East("E"),West("W"); // Semicolon required
    val opposite:Direction
        get() = when(this){
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

fun main(){
    val notation = North.notation
    println(notation)
    val opposite = North.opposite
    println(opposite)
    val oppositeOpposite = West.opposite.opposite
    println(oppositeOpposite)
    val oppositeNotation = North.opposite.notation
    println(oppositeNotation)
}