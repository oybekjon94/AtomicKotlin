package section07

data class Tag(var n: Int) {
    var s: String = ""
    fun increment() = ++n
}

fun main() {
    // let(): Access object with 'it'
// Returns last expression in lambda
    println(Tag(1).let {
        it.s = "let: ${it.n}"
        it.increment()
    })
    // let() with named lambda argument:
    println(Tag(2).let { tag ->
        tag.s = "let: ${tag.n}"
        tag.increment()
    })
    // run(): Access object with 'this'
// Returns last expression in lambda
    println(Tag(3).run {
        s = "run: $n" //implicit this
        increment() //implicit this
    })
    // with(): Access object with 'this'
// Returns last expression in lambda
    println(with(Tag(4)){
        s = "with: $n"
        increment()
    })
    // apply(): Access object with 'this'
// Returns modified object
    println(Tag(5).apply {
        s = "apply: $n"
        increment()
    })
    // also(): Access object with 'it'
// Returns modified object
    println(Tag(6).also {
        it.s = "also: ${it.n}"
        it.increment()
    })
    // also() with named lambda argument:
    println(Tag(7).also { tag ->
        tag.s = "also: ${tag.n}"
        tag.increment()
    })
}