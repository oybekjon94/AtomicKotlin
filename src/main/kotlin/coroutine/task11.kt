package coroutine

import kotlinx.coroutines.*

data class User(
    val userId:String,
    val name:String
)
fun getUserStandart(userId: String):User{
    Thread.sleep(1000)
    return User(userId, "Filip")
}
fun main(){
    getUserStandart("1")
}