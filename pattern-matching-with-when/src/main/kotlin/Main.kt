fun main(args: Array<String>) {
    var x: Int = 42

    when(x) {
        0,1,2,3,4,5 -> println("x is between 0 and 5")
        in 6..25 -> println("x is between 6 and 25")
        26 -> println("x is 26")
        42 -> println("x is 42")
        else -> {
            println("x is unknown")
        }
    }

    var y: Int = when(x) {
        in 0..42 -> 42
        else -> 50
    }
    println(y)

    when {
        x > 5 -> println("greater than 5")
        x < 5 -> println("less than 5")
        else -> println("equals 5")
    }
}