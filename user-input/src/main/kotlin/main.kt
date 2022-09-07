fun main(args: Array<String>) {
    println("Möchtest du das Programm beenden? y/n")
    val userInput = readLine()
    if (userInput == "y") {
        println("kkthxbye")
    } else {
        println("ok")
        val zahl = Integer.valueOf(readLine())
        println(zahl+2)
    }
}