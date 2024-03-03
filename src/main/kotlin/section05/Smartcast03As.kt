package section05

fun dogBarkUnSafe(c:Creature) =
    (c as Dog01).bark()

fun dogBarkUnSafe2(c:Creature):String{
    c as Dog01
    c.bark()
    return c.bark() + c.bark()
}

fun main(){
    println(dogBarkUnSafe(Dog01()))
    println(dogBarkUnSafe2(Dog01()))
}
