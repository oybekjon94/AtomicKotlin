package section01

fun main(){
    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1)
    showRange(0..9 step 3)
    showRange(9 downTo 2 step 3)
}
fun showRange(r: IntProgression){
    for (i in r){
        print("$i")
    }
    print("  // $r")
    println()
}