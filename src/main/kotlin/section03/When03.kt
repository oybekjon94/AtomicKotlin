package section03

//if else
fun bmiMetricOldIfElse(
    kg:Double,
    heightM:Double
):String{
    val bmi = kg / (heightM * heightM)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
//when
fun bmiMetricWithWhen(
    kg:Double,
    heightM:Double
):String{
    val bmi = kg / (heightM * heightM)
    return when{
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal weight"
        else -> "Overweigt"
    }
}
fun main(){
    println(bmiMetricOldIfElse(72.57,1.727))
    println(bmiMetricWithWhen(72.57,1.727))
}