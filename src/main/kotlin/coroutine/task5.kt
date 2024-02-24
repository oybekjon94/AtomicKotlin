package coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld03()
    println("Done")
}

suspend fun doWorld03() = coroutineScope {
    launch {
        delay(2000L)
        println("wordl2")
    }
    launch {
        delay(1000L)
        println("world1")
    }
    println("hello")
}