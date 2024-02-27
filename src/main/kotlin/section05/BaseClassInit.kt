package section05

open class GreatApe03(
    val weight:Double,
    val age:Int
)
open class Bonobo03(weight: Double,age: Int):GreatApe03(weight,age)

class Chimpanzee03(weight: Double,age: Int):GreatApe03(weight,age)

class BonoboB03(weight: Double,age: Int):Bonobo03(weight,age)

fun GreatApe03.info() = "wt: $weight age: $age"

fun main(){
    println(GreatApe03(100.0,12).info())
    println(Bonobo03(110.0,13).info())
    println(Chimpanzee03(100.0,15).info())
    println(BonoboB03(120.0,12).info())
}