package section07

import kotlin.random.Random

fun gets():String? =
    if (Random.nextBoolean()) "str!" else null

fun main(){
    println(gets()?.let {
        it.removeSuffix("!")+ it.length
    })
}