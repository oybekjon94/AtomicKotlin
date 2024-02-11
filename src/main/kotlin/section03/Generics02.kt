package section03

class GenericHolder<T>( private val value:T){ //1
    fun getValue():T = value
}

fun main(){
    val h1 = GenericHolder(Automobil("Ford"))
    val a:Automobil = h1.getValue() //2
    println(a)

    val h2 = GenericHolder(1)
    val i:Int = h2.getValue() //3
    println(i)

    val h3 = GenericHolder("Chartreuse")
    val s:String = h3.getValue() //4
    println(s)
}