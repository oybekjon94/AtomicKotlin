package section05

val group:List<Creature> = listOf(
    Human(), Human(),Dog01(),Alien01(),Dog01()
)

fun main(){
    val dog = group
        .find { it is Dog01 } as Dog01?
    println(dog?.bark())
}