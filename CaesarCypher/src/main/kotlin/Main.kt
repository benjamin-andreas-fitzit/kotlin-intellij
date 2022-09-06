fun main(args: Array<String>) {
    var meinArray: String = "hello world!"
    var verschluesselt = arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')

//    for (buchstabe: Char in meinArray) {
//        print(buchstabe+3)
//    }
//    print("\n")
    for (index in meinArray.indices) {
        verschluesselt[index] = meinArray[index] + 3
    }

    val encrypted: String = String(verschluesselt.toCharArray())

    println(encrypted)
}