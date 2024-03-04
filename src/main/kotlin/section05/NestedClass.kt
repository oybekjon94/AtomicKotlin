package section05
import section05.Airport.Plane
class Airport(private val code:String){
    open class Plane{
        //can access private properties
        fun conctact(airport: Airport) =
            "Contacting ${airport.code}"
    }
    private class PrivatePlane:Plane()
    fun privatePlane():Plane = PrivatePlane()
}
fun main(){
    val denver = Airport("DEN")
    var plane = Plane()   //1
    println(plane.conctact(denver))
    // Can't do this:
    // val privatePlane = Airport.PrivatePlane()
    val frankfurt = Airport("FRA")
    plane = frankfurt.privatePlane()
    // Can't do this:
    // val p = plane as PrivatePlane // [2]
    println(plane.conctact(frankfurt))
}