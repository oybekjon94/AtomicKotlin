package section02

//property accessors
class Data(var i: Int)
fun main(){
    val data = Data(10)
    data.i         // Read the 'i' property
    data.i = 20    // Write to the 'i' property
}