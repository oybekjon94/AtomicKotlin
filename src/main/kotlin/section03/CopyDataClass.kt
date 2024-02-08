package section03

data class DetailContact(
    val name:String,
    val surname:String,
    val number:String,
    val address:String
)

fun main(){
    val contact = DetailContact(
        "Miffiy",
        "Miller",
        "123344554",
        "seoul"
    )
    println(contact)

    val newContact = contact.copy(
        number = "56456",
        address = "Busan"
    )
    println(newContact)
}