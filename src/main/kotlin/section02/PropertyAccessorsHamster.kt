package section02

import kotlin.math.max

class Hamster02(val name:String){
    override fun toString(): String {
        return "$name"
    }
}
class Cage(private val maxCapacity:Int){
    override fun toString(): String {
        return "$maxCapacity"
    }

    private val hamsters = mutableListOf<Hamster02>()
    val capacity:Int
        get() = maxCapacity - hamsters.size
    val full:Boolean
        get() = hamsters.size == maxCapacity
    fun put(hamster02: Hamster02):Boolean =
        if (full)
            false
    else{
        hamsters += hamster02
            true
        }
    fun take():Hamster02 =
        hamsters.removeAt(0)
}

fun main(){
    val cage = Cage(2)
    cage.full
    cage.capacity
    println(cage)
    val cage02 = cage.put(Hamster02("Alice"))
    cage.put(Hamster02("Bob"))
    cage.full
    cage.capacity
    println(cage02)
    val cage03 = cage.put(Hamster02("Charlie"))
    cage.take()
    cage.capacity
    println(cage03)
}