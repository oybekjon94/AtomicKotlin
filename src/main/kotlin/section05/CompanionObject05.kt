package section05

class Counted{
    companion object{
        private var count = 0
    }
    private val id = count++
    override fun toString() = "#$id"
}
fun main(){
    println(List(4){Counted()})
}