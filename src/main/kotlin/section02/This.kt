package section02

class Hamster{
    fun speak() =  "Squeak"
    fun exercise() =
        this.speak() + //qualified with this
                speak() + //without this
                "Running on wheel"
}
fun main(){
    val hasmter = Hamster()
    println(hasmter.exercise())
}