package coroutine

import kotlinx.coroutines.*

fun main(){
    val job1 = GlobalScope.launch ( start = CoroutineStart.LAZY){
        delay(200)
        println("Pong")
        delay(200)
    }

    GlobalScope.launch {
        delay(200)
        println("Ping")
        job1.start()
        println("Ping")
        delay(200)
    }
    Thread.sleep(1000)
}