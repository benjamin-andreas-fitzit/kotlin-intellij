fun main(args: Array<String>) {
    var a: Int = 42
    var b: Int = 1337

    a = b.also {b = a}
    println(a)
    println(b)
}