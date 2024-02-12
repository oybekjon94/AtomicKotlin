package section03

fun main(){
    val nums = mutableListOf(0)
    var i = 0
    while (i < 100){
        i+=4
        if (i == 8) continue
        if (i == 40) break
        nums.add(i)
    }
    println(nums.joinToString())
}