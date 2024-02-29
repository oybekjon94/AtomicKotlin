package coroutine

import kotlin.concurrent.thread

fun getUserFromNetworkCallback(
    userID:String,
    onUserReady:(User) -> Unit
){
    thread {
        Thread.sleep(1000)
        val user = User(userID,"Filip")
        onUserReady(user)
    }
    println("end")
}
fun main(){
    getUserFromNetworkCallback("101"){user ->
        println(user)
    }
    println("main end")
}