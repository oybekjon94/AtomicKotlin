package section02

fun main(){
    val constants = mapOf(
        "pi" to 3.41,
        "e" to 2.34,
        "phi" to 1.23
    )
// Look up a value from a key:
    val looksFromKey = constants["e"]
    println(looksFromKey)

    val containsKeys = constants.keys
    println(containsKeys)

    val containsValue = constants.values
    println(containsValue)

    // Iterate through key-value pairs:
    var s = ""
    for (entry in constants){
        s += "${entry.key} = ${entry.value} "
    }
    println(s)
    // Unpack during iteration:
    var t = ""
    for ((key,value ) in constants){
        t += "$key = $value"
    }
    println(t)
}