package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(2000L)
}

fun task1(){
    print("hello")
}

suspend fun task2(){
    delay(1000L)
    print("world")
}