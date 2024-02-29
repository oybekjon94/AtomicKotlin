package section03

fun main(){
    val poem = """
        |-> Last night I saw upon the stair
            |-> A little man who wasn't there
                |-> He wasn't there again today
    |->Oh, how I wish he'd go away.
    """
    println(poem)
    val poem1 = """
        |-> Last night I saw upon the stair
            |-> A little man who wasn't there
                |-> He wasn't there again today
    |->Oh, how I wish he'd go away.
    """.trimMargin()
    println(poem1)
    val poem2 = """
        |-> Last night I saw upon the stair
            |-> A little man who wasn't there
                |-> He wasn't there again today
    |->Oh, how I wish he'd go away.
    """.trimMargin(marginPrefix = "|->")
    println(poem2)

}