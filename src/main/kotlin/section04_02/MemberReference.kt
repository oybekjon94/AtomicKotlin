package section04_02

data class Message(
    val sender:String,
    val text:String,
    val isRead:Boolean
)

fun main(){
    val messages = listOf(
        Message("Kitty","Hey!",true),
        Message("Kitty","Where are you?",false)
    )
    println(messages)

    val unread =
        messages.filterNot ( Message::isRead )
    println(unread.size)
    println(unread.single())
}