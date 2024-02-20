package lambda

import section03.f

fun main(){
    println(ageDescription(16))
    println(lambdaAgeDescription(10))
    println(sampleLambda("Oybek","Ivodullayivich","Kholikov"))
}

fun ageDescription(age:Int):String{
    if (age < 13) return "Child"
    else if (age in 12..19) return "Teenager"
    else if (age in 20..60) return "Adult"
    else return "Senior Citizen"
}

//with lambda
val lambdaAgeDescription:(Int) -> String = description@ {age:Int ->
    if (age < 13) return@description "Child"
    else if (age in 12..19) return@description "Teenager"
    else if (age in 20..60) return@description "Adult"
    else return@description "Senior Citizen"
}

//ignoring parameters
val sampleLambda:(String,String,String) -> Unit = { fName, _, lName -> println("${fName},${lName}")}

