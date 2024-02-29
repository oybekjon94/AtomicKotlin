package section05

open class Heater02{
    fun heat(temperature:Int) =
        "heating to $temperature"
}
class HVAC:Heater02(){
    fun cool(temperature: Int) =
        "cooling to $temperature"
}
fun warm(heater02: Heater02):String{
    return heater02.heat(70)
}
fun warmAndCool(hvac: HVAC):String{
    val heating =  hvac.heat(90)
    val cooling =  hvac.cool(90)
    return "$heating\n$cooling"
}
fun main(){
    val heater = Heater02()
    val hvac = HVAC()
    println(warm(heater))
    println(warm(hvac))
    println(warmAndCool(hvac))
}