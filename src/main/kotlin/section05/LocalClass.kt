package section05

fun localClasses(){
    open class Amphibian
    class Frog:Amphibian()
    val amphibian:Amphibian = Frog()
}