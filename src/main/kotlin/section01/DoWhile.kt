package section01

fun condition02(i : Int) = i < 100
fun main(){
    var i = 0
    do {
        println(".")
        i += 10
    }while (condition02(i))
}