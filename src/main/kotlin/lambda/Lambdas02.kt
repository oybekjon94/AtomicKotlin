package lambda

import kotlin.text.StringBuilder

fun main(){
    val fullName = "Oybek Kholikov"
    println(fullName.abbreviate())

    println(lambdaAbbreviate("Oybek Kholikov"))
}

//Extenction function
fun String.abbreviate():String{
    val splitStrings = this.split(" "," ", ignoreCase = true)
    val abbrevation:StringBuilder? = StringBuilder("")
    for (word in splitStrings){
        abbrevation?.append(word[0])
    }
    return abbrevation.toString().uppercase()
}

//with lambda
val lambdaAbbreviate:String.() -> String = {
    val splitStrings = this.split(" "," ", ignoreCase = true)
    val abbrevation:StringBuilder? = StringBuilder("")
    for (word in splitStrings){
        abbrevation?.append(word[0])
    }
    abbrevation.toString().uppercase()
}