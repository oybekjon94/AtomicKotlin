package section05

open class Heater{
    fun heat(temperature:Int) =
        "heating to $temperature"

}
fun farm(heater: Heater):String{
    return heater.heat(90)
}
fun main(){
    val heater = Heater()
    println(farm(heater))
}