package section05

import kotlin.Exception


class Exception1(
    val value:Int
):Exception("wron value: $value")

open class Exception2(
    description:String
):Exception(description)
open class Exception3(
    description:String
):Exception2(description)

fun main(){

}

