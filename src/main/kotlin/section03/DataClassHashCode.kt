package section03

data class Key(val name:String, val id:Int)

fun main(){
    val korvo:Key = Key("Korvo",19)
    val korvoHashCode = korvo.hashCode()
    println(korvo)
    println(korvoHashCode)

    val map = HashMap<Key,String>()
    map[korvo] = "Alien"
    println(map)

    val set = HashSet<Key>()
    val setAdd = set.add(korvo)
    println(setAdd)
    val setContain = set.contains(korvo)
    println(setContain)
}