package section04_02

data class PersonMaps(
    val name:String,
    val age:Int
)

val names = listOf("Alice","Arthricia",
    "Bob","Bill","Charlie")

val ages = listOf(21,15,25,42,21)

fun people():List<PersonMaps> =
    names.zip(ages) {name, age ->
        PersonMaps(name,age)
    }

fun main(){
    val map:Map<Int,List<PersonMaps>> =
        people().groupBy(PersonMaps::age)
    val map1 = map[15]
    println(map1)
    val map2 = map[21]
    println(map2)
    val map3 = map[22] //null
    println(map3)
}