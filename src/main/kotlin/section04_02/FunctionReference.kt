package section04_02

data class Message01(
    val sender:String,
    val text:String,
    val isRead:Boolean,
    val attachments:List<Attachment>
)

data class Attachment(
    val type:String,
    val name:String
)

fun Message01.isImportant():Boolean =
    text.contains("Salary increase") ||
            attachments.any{
                it.type == "image" &&
                        it.type.contains("cat")
            }

fun main(){
   val messages = listOf(Message01(
       "Boss","Let's discuss goals" +
       "for next year",false,
       listOf(Attachment("image","cute cats"))
   ))
    println(messages.any(Message01::isImportant))
}