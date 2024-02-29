package section05

fun Heater02.cool(temperature:Int) =
    "cooling to $temperature"
fun warmAndCool02(heater02: Heater02):String{
    val heatt = heater02.heat(70)
    val cooll = heater02.heat(90)
    return "$heatt\n$cooll"
}
fun main(){
    val heater = Heater02()
    println(warmAndCool02(heater))
}