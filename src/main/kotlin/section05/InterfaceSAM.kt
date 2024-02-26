package section05

fun interface ZeroArg{
    fun f():Int
}
fun interface OneArg{
    fun g(n:Int):Int
}
fun interface TwoArg{
    fun h(i:Int,j:Int):Int
}

class VerboseZero:ZeroArg{
    override fun f() = 11
}
val verboseZero = VerboseZero()
val samZero = ZeroArg { 11 }
class VerboseOne:OneArg{
    override fun g(n: Int) = n+47
}
val verboseOne = VerboseOne()

val samOne = OneArg { it+47 }
class VerboseTwo:TwoArg{
    override fun h(i: Int, j: Int) = i + j
}

val verboseTwo = VerboseTwo()
val samTwo = TwoArg{i,j -> i+j}

fun main(){
    println(verboseZero.f())
    println(samZero.f())
    println(verboseOne.g(92))
    println(samOne.g(92))
    println(verboseTwo.h(11,47))
    println(samTwo.h(11,47))
}