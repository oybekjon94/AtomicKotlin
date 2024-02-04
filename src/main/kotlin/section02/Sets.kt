package section02

//No duplicate
//Element order is unimportant
/*
intersect -> Returns a set containing all elements that are
contained by both this collection and the specified collection.
union -> Returns a set containing all distinct elements from both collections

 */
fun main(){
    val intSet = setOf(1,1,2,3,9,9,4)
    //Set membership
    if (9 in intSet){
        println("Nine is membership of Sets")
    }else{
        println("Nine is not membership of Sets")
    }
    //Does this set contain another set?
    val ninetynine = intSet.contains(99)
    println(ninetynine)
    //set union
    val union = intSet.union(setOf(3,4,5,6))
    println(union)

    //set intersection
    //infix notation
    val intersection = intSet intersect setOf(0,1,2,7,8)
    println(intersection)

    //set difference
    val differences = intSet.subtract(setOf(0,1,9,10))
    println(differences)

}