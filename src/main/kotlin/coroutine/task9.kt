package coroutine

import kotlinx.coroutines.*

fun main(){
    with(GlobalScope){
        val parentJob = launch {
            delay(200)
            println("I am parent")
            delay(200)
        }
        launch(context = parentJob) {
            delay(200)
            println("I am a child")
            delay(200)
        }
        if (parentJob.children.iterator().hasNext()){
            println("the job has children")
        }else{
            println("the job has no children")
        }
        Thread.sleep(1000)
    }
}