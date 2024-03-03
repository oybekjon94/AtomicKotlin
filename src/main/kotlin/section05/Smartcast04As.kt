package section05

fun dogBarkSafe(c:Creature) =
    (c as? Dog01)?.bark() ?: "Not a Dog"

fun main(){
    println(dogBarkSafe(Dog01()))
    println(dogBarkSafe(Human()))
}