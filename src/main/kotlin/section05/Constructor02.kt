package section05

private var counter = 0
class Message(text:String){
    private val content:String
    init {
        counter += 10
        content = "[$counter] $text"
    }
    override fun toString() = content
}
fun main(){
    val m1 = Message("Big ba-da boom")
    println(m1)
    val m2 = Message("Bzzzzt")
    println(m2)
}