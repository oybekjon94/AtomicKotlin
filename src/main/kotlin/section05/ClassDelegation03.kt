package section05

class DelegateControls02(
    private val controls: SpaceShipControls =
        SpaceShipControls()
):Controls by controls{
    override fun turboBost(): String =
        "${controls.turboBost()}...boooost!"
}
fun main(){
    val controls02 = DelegateControls02()
    println(controls02.forward(100))
    println(controls02.turboBost())
}
