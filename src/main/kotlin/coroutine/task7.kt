package coroutine

import kotlinx.coroutines.*

fun main(){
    GlobalScope.launch {
        tasks02()
    }
    tasks()
    Thread.sleep(2000L)
}

//main thread
fun tasks(){
    print("hello ")
    println(Thread.currentThread().name)
}

//worker thread
suspend fun tasks02(){
    withContext(Dispatchers.IO){
        delay(1000L)
        print("world ")
        println(Thread.currentThread().name)
    }
}