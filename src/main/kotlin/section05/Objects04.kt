package section05

object Outer{
    object Nested{
        val a = "Outer.Nested.a"
    }
}
class HasObject{
    object Nested{
        val a = "HasObject.Nested.a"
    }
}
fun main(){
    println(Outer.Nested.a)
    println(HasObject.Nested.a)
}