//array types

fun main(args: Array<String>) {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)  //int array
    println("Array of numbers ${numbers.joinToString()}")

    val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
    println(characters.joinToString()) // K, t, l

    val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
    println(doubles.joinToString()) // 1.25, 0.17, 0.4

    println("------------------------------")

    //----------------------------------------
    //Creating an array of a specified size
    val numbers1 = IntArray(5) // an array of 5 integer numbers
    println(numbers1.joinToString())

    val doubles1 = DoubleArray(7) // an array of 7 doubles
    println(doubles1.joinToString())

    println("-------------------------------------")

    //-----------------------------------------
    //apply scope function and fill() method

    val numbers3 = IntArray(10) { i -> i + 1 }
    println("Numbers: ${numbers3.joinToString()}")    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val onlyOne = IntArray(10) { 1 }
    println("Only 1: ${onlyOne.joinToString()}")    // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")    // -1, -1, -1, -1, -1, -1, -1, -1, -1, -1


}