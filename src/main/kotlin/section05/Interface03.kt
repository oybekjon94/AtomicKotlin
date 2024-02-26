package section05

interface Hotness{
    fun feedback():String
}

enum class SpiceLevel:Hotness{
    Mild{
        override fun feedback() = "it adds flavor!"
    },
    Medium{
        override fun feedback() = "is it warm in here?"

    },
    Hot{
        override fun feedback() = "I am suddenly sweating a lot"
    },
    Flaming{
        override fun feedback() = "I am in pain. I am suffering"

    }
}

fun main(){
    println(SpiceLevel.values().map { it.feedback() })
}