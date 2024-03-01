package coroutine

import kotlin.concurrent.thread

fun getUserFromNetworkCallback02(
    userId:String,
    onUserResponse:(User?,Throwable?) -> Unit
) {
    thread {
        try {
            Thread.sleep(1000)
            val user = User(userId,"Filip")

            onUserResponse(user,null)
        }catch (error:Throwable){
            onUserResponse(null,error)
        }
    }
}
fun main(){
    getUserFromNetworkCallback02("101"){user,error ->
        user?.run { ::println }

        error?.printStackTrace()
    }
}