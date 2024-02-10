package section03

class Person02(
    val name:String,
    var friend:Person02? = null
)
fun main(){
    val alice = Person02("Alice")
    val alice1 = alice.friend?.friend?.name
    println(alice1)

    val bob = Person02("Bob")
    val charlie = Person02("Charlie",bob)
    bob.friend = charlie
    val bob1 = bob.friend?.friend?.name
    val bob2 = bob.friend?.name
    println(bob1)
    println(bob2)

    val alice2 = (alice.friend?.friend?.name ?: "Unknown")
    println(alice2)
}