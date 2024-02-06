package section02

class Badger(id:String, years:Int){
    val name = id
    val age  = years
    override fun toString(): String {
        return "Badger: $name, age: $age"
    }
}
class Snake(
    val type:String, val length:Double){
    override fun toString(): String {
        return "Snake: $type, length: $length"
    }
}
class Moose(
    val age:Int,val height:Double
){
    override fun toString(): String {
        return "Moose, age: $age, height: $height"
    }
}
fun main(){
    Badger("Bob",11)
    Snake("Garden",2.4)
    Moose(16,7.2)
}

