package section05

open class House(
    val address:String,
    val state:String,
    val zip:String
){
    constructor(fullAddress:String):
            this(fullAddress.substringBefore(" "),
                fullAddress.substringAfter(" ")
                    .substringBefore(" "),
                fullAddress.substringAfterLast(" "))
    val fullAddress:String
        get() = "$address, $state $zip"
}

class VacationHouse(
    address: String,
    state: String,
    zip: String,
    val startMonth:String,
    val endMonth:String
):House(address,state,zip){
    override fun toString() =
        "Vacation house at $fullAddress " +
                "from $startMonth to $endMonth"
}

class TreeHouse(
    val name:String
):House("Tree Street, TR 00000"){
    override fun toString() =
        "$name tree house at $fullAddress"
}
fun main(){
    val vacationHouse = VacationHouse(
        address = "8 Target St.",
        state = "KS",
        zip = "66632",
        startMonth = "May",
        endMonth = "September"
    )
    println(vacationHouse)
}
