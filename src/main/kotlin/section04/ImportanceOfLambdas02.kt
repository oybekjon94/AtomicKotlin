package section04

fun filterEven02(nums:List<Int>):List<Int>{
    val result = mutableListOf<Int>()
    for (i in nums){
        if (i > 2){
            result += i
        }
    }
    return result
}
fun main(){
    println(filterEven02(listOf(1,2,3,4)))
}