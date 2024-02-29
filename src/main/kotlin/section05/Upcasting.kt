package section05


interface Shape{
    fun draw():String
    fun erase():String
}
class Circle:Shape{
    override fun draw() = "Circle.draw"

    override fun erase() = "Circle.erase"

}
class Square:Shape{
    override fun draw() = "Square.draw"

    override fun erase() = "Square.erase"
    fun color() = "Square.color"

}
class Triangle:Shape{
    override fun draw() = "Triangle.draw"

    override fun erase() = "Triangle.erase"
    fun rotate() = "Triangle.rotate"
}
//The show() function accepts any Shape:
// Upcasting/Drawing.kt
//package upcasting
//import atomictest.*
//fun show(shape: Shape){
//    trace("Show: ${shape.draw()}")
//}
//fun main() {
//    listOf(Circle(), Square(), Triangle())
//        .forEach(::show)
//}