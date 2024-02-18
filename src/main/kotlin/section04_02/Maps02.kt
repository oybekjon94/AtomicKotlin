package section04_02

fun main(){
    val groups =
        people().groupBy { it.name.first() }
    val groups1 = groups['A']
    println(groups1)
    println(groups['Z']) //null

    val groups2 = people().filter {
        it.name.first() == 'A'
    }
    println(groups2)
    println(people().filter {
        it.name.first() == 'F'
    })

    val groups3 = people().partition {
        it.name.first() == 'A'
    }
    println(groups3)
}