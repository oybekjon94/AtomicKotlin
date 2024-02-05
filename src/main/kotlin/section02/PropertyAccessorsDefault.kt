package section02

import jdk.internal.org.jline.utils.Log.trace


class Default{
    var i : Int = 0
        get() {
            trace("get()")
            return field
        }
        set(value){
            trace("set($value")
            field = value
        }
}
fun main(){
    val d = Default()
    d.i = 2
    println(d)
}