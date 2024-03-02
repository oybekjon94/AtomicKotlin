package section05

interface Controls{
    fun up(velocity:Int):String
    fun down(velocity:Int):String
    fun left(velocity:Int):String
    fun right(velocity:Int):String
    fun forward(velocity:Int):String
    fun back(velocity:Int):String
    fun turboBost():String
}
class SpaceShipControls:Controls{
    override fun up(velocity: Int) =
        "up $velocity"

    override fun down(velocity: Int) =
        "down $velocity"

    override fun left(velocity: Int) =
        "left $velocity"

    override fun right(velocity: Int) =
        "right $velocity"

    override fun forward(velocity: Int) =
        "forward $velocity"

    override fun back(velocity: Int) =
        "back $velocity"

    override fun turboBost() = "turbo boost"
}
class ExplicitControls:Controls{
    private val controls = SpaceShipControls()
    override fun up(velocity: Int) =
        controls.up(velocity)

    override fun down(velocity: Int)=
        controls.down(velocity)

    override fun left(velocity: Int)=
        controls.left(velocity)

    override fun right(velocity: Int)=
        controls.right(velocity)

    override fun forward(velocity: Int)=
        controls.forward(velocity)

    override fun back(velocity: Int)=
        controls.back(velocity)

    //modified implementation
    override fun turboBost():String =
        controls.turboBost() + "...boooost!"
}
fun main(){
    val controls = ExplicitControls()
    println(controls.forward(100))
    println(controls.turboBost())
}