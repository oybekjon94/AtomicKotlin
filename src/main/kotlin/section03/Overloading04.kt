package section03

fun addInt(i:Int,j:Int) = i+j
fun addDouble(i:Double, j:Double) = i+j

fun add(i:Int, j:Int) = i+j
fun add(i:Double,j:Double) = i+j

fun main(){
    addInt(5,6)
    addDouble(4.34,3.4)

    //same
    add(5,6)
    add(5.6,6.7)
}