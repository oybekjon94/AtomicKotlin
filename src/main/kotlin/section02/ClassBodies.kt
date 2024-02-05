package section02

class NoBody

class SomeBody{
    val name = "Janet Doe"
    override fun toString(): String {
        return name
    }
}

class EveryBody{
    val all = listOf(SomeBody(), SomeBody(), SomeBody())
}

fun main(){
    val nb = NoBody()
    val sb = SomeBody()
    val eb = EveryBody()
    println(nb)
    println(sb)
    println(eb.all)
}