//2 dimensional array

fun main(srgs: Array<String>) {
    //creating array
    val ary2d = arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0)
    )

    //creating empty array
    val empty2DInt = arrayOf<Array<Int>>()

    //accessing array
    println(ary2d[2][2])
    println(ary2d[0][0])  // 0
    println(ary2d[0][1])  // 1
    println(ary2d[0][2])  // 2
    println(ary2d[1][0])  // 3
    println(ary2d[1][1])  // 4
    println(ary2d[1][2])  // 5

    //-----------------------------
    //creating string type array
    val arrayOfString2D = arrayOf(
        arrayOf<String>("to", "be", "or"),
        arrayOf<String>("not", "to", "be")
    )
    println(arrayOfString2D[0][0])  //to

    //--------------------------------
    //character array
    val arrayOfChar2D = arrayOf(
        charArrayOf('A', 'R', 'R'),
        charArrayOf('A', 'Y', 'S')
    )
    println(arrayOfChar2D[0][1])    //R

    //------------------------------------
    //int and string both in aaray
    val arrayOfString = arrayOf(
        arrayOf("Practice", "makes", "perfect"),
        arrayOf(1, 2)
    )
    println(arrayOfString[1][1])  //2

    //------------------------------------
    //joinToString() and contentDeepToString() -

    println(ary2d.contentDeepToString())
    println(ary2d[0].contentDeepToString())
    println(arrayOfString[0].joinToString())

}