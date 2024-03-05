package section05

class CompanionObjectFunction{
    companion object{
        private var n:Int = 0
        fun increment() = ++n
    }
}
fun main(){
    println(CompanionObjectFunction.increment())
    println(CompanionObjectFunction.increment())
}