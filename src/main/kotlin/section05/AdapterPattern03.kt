package section05

//target interface
interface ThreePinSocket{
    fun acceptThreePinPlug()
}
//Adaptee
class TwoPinPlug{
    fun insertTwoPinPlug(){
        println("Two-pin plug inserted")
    }
}
//Adapter
class PlugAdapter(private val plug:TwoPinPlug):ThreePinSocket{
    override fun acceptThreePinPlug() {
        plug.insertTwoPinPlug()
        println("Adapter made it compatible with three-pin socket!")
    }

}
fun main(){
    val twoPinPLug = TwoPinPlug()
    val adapter = PlugAdapter(twoPinPLug)
    adapter.acceptThreePinPlug()
}