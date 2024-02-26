package section05

open class GreatApe{
    val weight = 100.0
    val age = 12
}
open class Bonobo:GreatApe()
class Chimpanzee:GreatApe()
class BonoboB :Bonobo()

fun GreatApe.info() = "wt: $weight age: $age"

fun main(){
    println(GreatApe().info())
    println(Bonobo().info())
    println(Chimpanzee().info())
    println(BonoboB().info())
}