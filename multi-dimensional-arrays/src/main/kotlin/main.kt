//2,3,4,5,6,4,3,2
//1,1,1,1,1,1,1,1
//0,0,0,0,0,0,0,0
//0,0,0,0,0,0,0,0
//0,0,0,0,0,0,0,0
//0,0,0,0,0,0,0,0
//1,1,1,1,1,1,1,1
//2,3,4,5,6,4,3,2

fun main(args: Array<String>) {
    var zeile1 = arrayOf(2,3,4,5,6,4,3,2)
    var zeile2 = arrayOf(1,1,1,1,1,1,1,1)
    var zeile3 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile4 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile5 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile6 = arrayOf(0,0,0,0,0,0,0,0)
    var zeile7 = arrayOf(1,1,1,1,1,1,1,1)
    var zeile8 = arrayOf(2,3,4,5,6,4,3,2)
    var spielfeld = arrayOf(zeile1, zeile2, zeile3, zeile4, zeile5, zeile6, zeile7, zeile8)

    for (zeile in spielfeld) {
        for (feld in zeile) {
            print(feld)
            print(",")
        }
        print("\n")
    }
    print("\n")

    spielfeld[1][3] = 0
    spielfeld[3][3] = 1

    for (zeile in spielfeld) {
        for (feld in zeile) {
            print(feld)
            print(",")
        }
        print("\n")
    }
}