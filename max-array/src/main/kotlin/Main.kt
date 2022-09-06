fun main(args: Array<String>) {
    var meinArray = intArrayOf(433643,5435,345,435345,43543,543,6, 8643489, 45,7,56,756,5,64,76,5,36,6,6,547,7,65,8,8,475,6)
    var max: Int = 0

    for (value in meinArray) {
        if (value > max) {
            max = value
            }
    }
    println(max)
}