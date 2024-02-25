package coroutine

import kotlinx.coroutines.*

fun main(){
    var isDoorOpen = false
    println("Unlocking the door... please wait.\n")
    GlobalScope.launch {
        delay(3000)

        isDoorOpen = true
    }

    GlobalScope.launch {
        repeat(4){
            println("Trying to open the door...\n")
            delay(800)

            if (isDoorOpen){
                println("Opened the door\n")
            }else{
                println("the door is still locked\n")
            }
        }
    }
    Thread.sleep(5000)
}