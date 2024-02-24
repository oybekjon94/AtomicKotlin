package coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld02()
}

suspend fun doWorld02() = coroutineScope {
    launch {
        delay(1000L)
        println("World")
    }
    println("hello")
}