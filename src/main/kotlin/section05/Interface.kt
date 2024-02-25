package section05

interface Computer {
    fun prompt(): String
    fun calculateAnswer(): Int
}

class Desktop : Computer {
    override fun prompt() = "Hello~"

    override fun calculateAnswer() = 11
}

class DeepThought : Computer {
    override fun prompt() = "Thinking..."
    override fun calculateAnswer() = 42
}

class Quantum : Computer {
    override fun prompt() = "Probably..."

    override fun calculateAnswer() = -1

}

fun main(){
    val computers = listOf(
        Desktop(),DeepThought(),Quantum()
    )
    println(computers.map { it.calculateAnswer() })
    println(computers.map { it.prompt() })
}