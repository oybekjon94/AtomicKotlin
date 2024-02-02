package section02

class MutableNameAlien(var name:String)
class FixedNameAlien(val name:String)

fun main(){
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")

    alien1.name = "Parasite"  //we can reassign
    //alien2.name = "Parasite" //we can't reassign
}