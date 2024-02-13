package section04

import section03.indeces

fun main(){
    val list = listOf(1,2,3,4)
    val result = list.map({n:Int -> "[$n]"})
    println(result)

    val list2 = listOf(1,2,3,4)
    val result2 = list2.map({n -> "[$n]"})
    println(result2)

    val list3 = listOf(1,2,3,4)
    val result3 = list3.map({"[$it]"})
    println(result3)

    val list4 = listOf('a','b','c','d')
    val result4 = list4.map { "[${it.toUpperCase()}]" }
    println(result4)

    val list5 = listOf(9,11,23,32)
    val result5 = list5.joinToString(" "){"[$it]"}
    println(result5)

    val list6 = listOf(9,1,232,1)
    val result6 = list6.joinToString(
        separator = " ",
        transform = {"[$it]"}
    )
    println(result6)

    val list7 = listOf('a','b','c')
    val result7 = list7.mapIndexed{index,element ->
        "[$index: $element]"
    }
    println(result7)

    val list8 = listOf('a','b','c')
    val result8 = list8.mapIndexed{index, _ ->
        "[$index]"
    }
    println(result8)

    val list9 = listOf('a','b','c')
    val result9 = list9.indeces.map {
        "[$it]"
    }
    println(result9)
}