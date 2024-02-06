package section03

class Book(val title:String)

fun Book.categorize(category:String) =
    """title: "$title", category" $category""""

fun main(){
    val book = Book("Dracula").categorize("Vampite")
    println(book)
}