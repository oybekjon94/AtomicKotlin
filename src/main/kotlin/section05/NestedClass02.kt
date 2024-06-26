package section05

abstract class Cleanable(val id:String){
    open val parts:List<Cleanable> = listOf()
    fun clean():String{
        val text = "$id clean"
        if (parts.isEmpty()) return text
        return "${parts.joinToString(
            " ","(",")",
            transform = Cleanable::clean
        )}  $text\n"
    }
}
class House01:Cleanable("House"){
    override val parts = listOf(
        Bedroom("Master Bedroom"),
        Bedroom("Guest Bedroom")
    )
    class Bedroom(id:String):Cleanable(id){
        override val parts = listOf(
            Closet(),Closet.Bathroom()
        )
        class Closet:Cleanable("Closet"){
            override val parts = listOf(
                Shelf(), Shelf()
            )
            class Shelf:Cleanable("Shelf")
            class Bathroom :Cleanable("Bathroom"){
                override val parts = listOf(
                    Toilet(),Sink()
                )
                class Toilet:Cleanable("Toilet")
                class Sink:Cleanable("Sink")
            }
        }
    }
}
fun main(){
    println(House01().clean())
}