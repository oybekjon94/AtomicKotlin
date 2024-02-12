package section03

fun main(){
   val strings = mutableListOf<String>()
    for (c in 'a'..'c'){
        for (i in 1..4){
            val value = "$c$i"
            if (value < "c3"){
                strings.add(value)
            }
        }
    }
    println(strings.joinToString())
}