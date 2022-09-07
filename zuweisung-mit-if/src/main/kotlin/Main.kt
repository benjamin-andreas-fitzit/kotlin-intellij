fun main(args: Array<String>) {

    var a = 42
    var b = 1337
    var max = if (a > b) a else b

    max = if (a > b) {
        println("max is a")
        a
    } else {
        println("max is b")
        b
    }

    println(max)
}