package youtube

//equals == //bu ikkita objectni reference bir joyga yonalganmi check
//hashcode
fun main(){
    val p1 = Person("Ali",25)
    val p2 = Person("Ali",25)
    println(p1 == p2) //false
    val set = setOf(p1,p2) //hashcode qarab check
    println(set.toString())

//    println(p1 === p2) //reference check //false
//    val p3 = p2
//    println(p3 === p2) //true
}

open class Person(val name:String, val age:Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null)return false
        if (other is Person){
            if (name != other.name)return false
            if (age != other.age) return false
            return true
        }else{
            return false
        }
    }

    override fun toString(): String {
        return "$name, $age"
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
