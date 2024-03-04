package section05

abstract class Abstrack(val av:String){
    open fun concreteFunction(){}
    open val concreteProperty = ""
    abstract fun abstractFunction():String
    abstract val abstrackProperty:String
    init {}
    constructor(c:Char):this(c.toString())
}
open class Concrete():Abstrack(""){
    override fun concreteFunction() {}
    override val concreteProperty = ""
    override fun abstractFunction() = ""

    override val abstrackProperty = ""
}
sealed class Sealed(val av:String){
    open fun concreteFunction(){}
    open val concreteProperty = ""
    abstract fun abstractFunction():String
    abstract val abstrackProperty:String
    init {}
    constructor(c:Char):this(c.toString())
}
open class SealedSubclass():Sealed(""){
    override fun concreteFunction() {}
    override val concreteProperty = ""
    override fun abstractFunction() = ""

    override val abstrackProperty = ""
}
fun main(){
    println(Concrete())
    println(SealedSubclass())
}