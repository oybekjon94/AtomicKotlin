package section04_02

fun main(){
   val even = mapOf(2 to "two", 4 to "four")
    println(even.map {
        "${it.key} = ${it.value}"
    })

    println(even.map { (key,value) ->
        "$key = $value"
    })

    println(even.mapKeys {(num,_) -> -num
    }.mapValues { (_,str) -> "minus $str" })

    println(even.map {(key,value) ->
        -key to "minus $value"}.toMap())
}