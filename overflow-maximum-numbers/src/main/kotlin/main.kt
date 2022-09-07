fun main(args: Array<String>) {
    var int: Int = 0
    while (int < int+1) {
        int = int+1
    }
    println(int)
    println(int+1)

   var long: Long = 1
   while (long < long*2) {
       long = long*2
   }
    var counter: Long = long
    while (counter >= 1) {
        while (long < long+counter) {
            long = long+counter
        }
        counter = counter/2
    }
    println(long)
    println(long+1)
}