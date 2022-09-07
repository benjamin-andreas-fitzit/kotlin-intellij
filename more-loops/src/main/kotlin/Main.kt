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
    println()
    // und jetzt noch ranges dazu

    for (i in 0..20) {
        println(i)
    }

    for (i in 42 downTo 19) {
        println(i)
    }

    for (i in 42..82 step 2) {
        println(i)
    }

    println()
    //for Each Schleife

    var meinArrr = arrayOf(42,42,42,42,42,42,42,42,42,42,42,42)

    meinArrr.forEach { println(it) }

    for ((i, zahl) in meinArrr.withIndex()) {
        println("index = $i")
        println("zahl = $zahl")
    }
}