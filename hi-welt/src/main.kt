import kotlin.math.pow

fun main() {

    var width: Int = 1920
    var radius: Double = 9.0

    var myArray = arrayOf(0, 1, 2, "Vielen Dank für die Blumen")
    var my2ndArray = Array(10) {i -> i}

    var a: Int = 10
    var b: Int = 20
    var max: Int

    val pi: Double = Math.PI
    val height: Int = 1080

    println("Total Pixels: " + width*height + " pixels.")
    println("Circular area: " + pi * radius * radius + "cm².")

    println(myArray[3])

    if (my2ndArray[2] == 2) {
        println("es ist 2!")
    }

    if (a > b) {
        max = a
    } else {
        max = b
    }

    println(max)

}