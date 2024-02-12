package section03

fun main(){
    val nums = mutableListOf(0)
    for (i in 4 until 100 step 4){
        if (i == 8)continue
        if (i == 40)break
        nums.add(i)
    }
    println(nums.joinToString())
}