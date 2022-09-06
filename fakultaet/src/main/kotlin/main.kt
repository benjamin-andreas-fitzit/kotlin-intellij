fun main(args: Array<String>) {
    // Fakultät: 5! = 5*4*3*2 // 0! = 1

    var n: Int = 10
    var i: Int = 1
    var fakultaet: Int = 1

    while (i <= n) {
        fakultaet = fakultaet * i
        i++
    }

    println(fakultaet)
}