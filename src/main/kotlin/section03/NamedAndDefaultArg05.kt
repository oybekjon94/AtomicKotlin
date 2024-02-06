package section03

class DefaultArg

fun h(d:DefaultArg = DefaultArg()) = println(d)

fun main(){
    h()
    h()
}