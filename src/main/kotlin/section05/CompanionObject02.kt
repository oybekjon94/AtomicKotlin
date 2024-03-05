package section05

class WithNamed{
    companion object Named{
        fun s() = "from Named"
    }
}
class WithDefault{
    companion object{
        fun s() = "from Default"
    }
}
fun main(){
    println(WithNamed.s())
    println(WithNamed.Named.s())
    println(WithDefault.s())
    // The default name is "Companion":
    println(WithDefault.Companion.s())
}