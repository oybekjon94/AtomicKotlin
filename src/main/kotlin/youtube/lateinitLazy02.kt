package youtube

fun main(){
    val lazyClass = LazyClass()

    println(lazyClass.heavyClass)
}
class LazyClass(){
    //val heavyClass = HeavyClass()

    //lazy
    //qachon chaqirsak shunda create
    val heavyClass by lazy {
        HeavyClass()
    }
}
class HeavyClass{
    init {
        println("Heavy Class created")
    }

    override fun toString(): String {
        return "Heavy Class"
    }
}

