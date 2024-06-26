package section07

class Gnome(val name:String){
    fun who() = "Gnome: $name"
}
fun whatGnome(gnome: Gnome?){
    gnome?.let { it.who() } // [1]
    gnome.let { it?.who() }
    gnome?.run { who() } // [2]
    gnome.run { this?.who() }
    gnome?.apply { who() } // [3]
    gnome.apply { this?.who() }
    gnome?.also { it.who() } // [4]
    gnome.also { it?.who() }
// No help for nullability:
    with(gnome) { this?.who() }
}