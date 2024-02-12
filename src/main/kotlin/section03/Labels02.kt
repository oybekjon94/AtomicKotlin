package section03

fun main(){
   val strings = mutableListOf<String>()
    var c = 'a' -1
    outer@ while (c<'f'){
        c+=1
        var i = 0
        do {
            i++
            if (i == 5)continue@outer
            if ("$c$i" == "c3")break@outer
            strings.add("$c$i")
        }while (i < 10)
    }
    println(strings.joinToString())
}