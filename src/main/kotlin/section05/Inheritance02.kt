package section05

import section03.add

open class GreatApe02{
    protected var energy = 0
    open fun call() = "Hoo!"
    open fun eat() {
        energy += 10
    }
    fun climb(x:Int){
        energy -= x
    }
    fun energyLevel() = "Energy: $energy"
}
class Bonobo02:GreatApe02(){
    override fun call() = "Eep!"
    override fun eat() {
        // Modify the base-class var:
        energy += 10
        // Call the base-class version:
        super.eat()
    }
    //add a function
    fun run() = "Bonobo run"
}
class Chimpanzee02:GreatApe02(){
    //new property
    val additionalEnergy = 20
    override fun call()= "Yawp"
    override fun eat() {
        energy += additionalEnergy
        super.eat()
    }
    //add a function
    fun jump() = "Chimp jump"
}
fun talk(ape:GreatApe02):String{
    // ape.run() // Not an ape function
    // ape.jump() // Nor this
    ape.eat()
    ape.climb(10)
    return "${ape.call()} ${ape.energyLevel()}"
}
fun main(){
    // Cannot access 'energy':
    // GreatApe().energy
    println(talk(GreatApe02()))
    println(talk(Bonobo02()))
    println(talk(Chimpanzee02()))
}