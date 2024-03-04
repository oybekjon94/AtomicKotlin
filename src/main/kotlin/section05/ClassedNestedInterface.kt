package section05

interface Item{
    val type:Type
    data class Type(val type:String)
}
class Bolt(type:String):Item{
    override val type = Item.Type(type)
}
fun main(){
    val items = listOf(
        Bolt("Slotted"),Bolt("Hex")
    )
    println(items.map(Item::type))
}
