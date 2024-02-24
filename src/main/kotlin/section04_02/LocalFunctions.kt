package section04_02

//Appends value to this StringBuilder, followed by a line feed character (\n).
fun main(){
    val logMsg = StringBuilder()
    println(logMsg)
    fun log(message:String) =
        logMsg.appendLine(message)
    log("Starting computation")
    val x = 42 //imitate computation
    println( log("Computation result: $x"))
}