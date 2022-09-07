fun main(args: Array<String>) {
    var meinString: String? = null
    var meinAndererString: String? = "hello world"
    var length: Int = meinString?.length ?:0
    var length2: Int? = meinAndererString?.length
    println(meinString?.length ?:"String ist null")
    println(meinAndererString!!.length)
    println(length)
    length2?.let {
        println(length2)
        println("yey, length2 ist sicher nicht null")
    }
}