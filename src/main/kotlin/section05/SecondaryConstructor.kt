package section05

enum class Material{
    Ceramic,Metal,Plastic
}
class GardenItem(val name:String){
    var material:Material = Material.Plastic
    constructor(
        name:String,material: Material //1
    ):this(name){                      //2
        this.material = material       //3
    }
    constructor(
        material: Material
    ):this("Strange Thing",material) //4

    override fun toString() = "$material $name"
}
fun main(){
    println(GardenItem("Elf").material)
    println(GardenItem("Snowman").name)
    println(GardenItem("Gazing Ball",Material.Metal)) //5
    println(GardenItem(material = Material.Ceramic))
}
