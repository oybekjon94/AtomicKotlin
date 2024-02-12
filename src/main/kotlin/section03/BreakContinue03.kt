package section03

fun main(){
    val nums = mutableListOf(0)
    var i = 0
    do {
        i+=4
        if (i == 8) continue
        if (i == 40) break
        nums.add(i)
    }while (i < 100)
    println(nums.joinToString())
}