package section03

data class Automobil(val brand:String)

class RigidHolder(private val a:Automobil){
    fun getValue() = a
}

fun main(){
    val holder = RigidHolder(Automobil("BMW"))
    println(holder.getValue())
}