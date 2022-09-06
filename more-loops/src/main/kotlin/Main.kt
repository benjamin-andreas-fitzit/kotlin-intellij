fun main(args: Array<String>) {
    var zaehler: Int = 0
    while(zaehler <= 10) {
        zaehler++
        if (zaehler == 10) {
            break
        }
        print(zaehler)
    }
    println("\n")

    var x: Int = 0

    do {
        print(x)
        x++
    } while (x <= 9)
}