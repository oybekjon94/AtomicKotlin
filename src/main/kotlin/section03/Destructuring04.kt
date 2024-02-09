package section03

data class Tuple(
    val i:Int,
    val d:Double,
    val s:String,
    val b:Boolean,
    val l:List<Int>
)
fun main(){
    val tuple = Tuple(1,3.12,"Mouse",false, listOf())
    val (i,d,s,b,l) = tuple
    i
    d
    s
    b
    l

    val (_,_,animal) = tuple
    animal
    println(tuple.s)
    println(tuple.i)
}