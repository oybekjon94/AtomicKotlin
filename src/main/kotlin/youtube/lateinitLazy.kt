package youtube

fun main(){
    val lateInitClass = LateInitClass()
    lateInitClass.setLateName("Ali")
    println(lateInitClass.getLateName())


}

class LateInitClass(){
    lateinit var name:String

    fun setLateName(name:String){
        this.name = name
    }
    fun getLateName():String{
        if (::name.isInitialized) //check
        return name
        else return "Uninitialezed"
    }
}