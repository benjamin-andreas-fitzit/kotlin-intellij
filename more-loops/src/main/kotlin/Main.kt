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

    println()
    // jetzt kommen break und continue

    var meinString: String = "hello darkness my old friend"
    println(meinString)

    for (char: Char in meinString) {
        println(char)
        if (char == ' ') {
            break
        }
    }

    for (char: Char in meinString) {
        if (char == ' ') {
            continue
        }
        print(char)
    }

    println()

    var zahl: Int = 5

    nicola@while (zahl > 0) {
        ben@for (char: Char in meinString) {
            print(char)
            if (char == ' ') {
                break@nicola
            }
        }
        zahl--
    }
}