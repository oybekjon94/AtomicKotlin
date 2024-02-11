package section03

fun main(){
    val array = Array<String>(2){i -> i.toString()}
    println(array.joinToString())
}

class Person03<T>(val data:T){
    fun getValue():T{
        return data
    }
}