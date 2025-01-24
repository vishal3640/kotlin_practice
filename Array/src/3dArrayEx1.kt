//3 dimensional array

fun main(args: Array<String>) {
    val array3D = arrayOf(
        arrayOf(arrayOf(0, 1), arrayOf(2, 3)),
        arrayOf(arrayOf(4, 5), arrayOf(6, 7))
    )

    println(array3D.contentDeepToString())  // [[[0, 1], [2, 3]], [[4, 5], [6, 7]]]
    println(array3D[0][0][1])   // 1
    println(array3D[1][0][1])   // 5
    println(array3D[1][1][1])   // 7
    println(array3D[0][1][0])   // 2

}