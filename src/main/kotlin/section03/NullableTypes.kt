package section03

fun main(){
    val s1 = "abs"
    //val s2:String = null //compile-time error

    val s3:String? = null
    val s4:String? = s1

    //val s5:String = s4  //Compil-time error
    val s6 = s4

    println(s1)
    println(s3)
    println(s4)
    println(s6)
}