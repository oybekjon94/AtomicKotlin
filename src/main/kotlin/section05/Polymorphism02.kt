package section05

fun main(){
    val triangle02 = EqualSideTriangle02()
    println(triangle02.calculateLength())
}
open class Shape02(){
    open fun calculateArea(){
        println("calculate area")
    }
    open fun calculateArea(side:Int){
        println("calculate area")
    }
    open fun calculateArea(side:Double){
        println("calculate area")
    }
    open fun calculateLength(){
        println("calculate the length")
    }
}
open class Triangle02():Shape02(){
    override fun calculateArea() {
        println("calculate the traingle Area")
    }

    override fun calculateLength() {
        //super.calculateLength() //ota classdagi
        println("calculate the triangle parameter")
    }
}
class EqualSideTriangle02():Triangle02(){
    override fun calculateLength() {
        super.calculateLength()
        println("this is equal side triangle")
    }
}