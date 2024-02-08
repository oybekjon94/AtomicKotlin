package section03

class Person(val name:String)

data class Contact(
    val name:String,
    val number:String
)

fun main(){
    val person1 = Person("Cleo")
    println(person1)
    val contact = Contact("Miffy","1223434")
    println(contact)
}