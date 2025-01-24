fun main(args: Array<String>) {
    //Accessing elements
    val numbers = IntArray(3) // numbers: 0, 0, 0

    println("Before accessing  : ${numbers.joinToString()}")
    numbers[0] = 1 // numbers: 1, 0, 0
    numbers[1] = 2 // numbers: 1, 2, 0
    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

    println("After accessing  : ${numbers.joinToString()}")

    println(numbers[0]) // 1, the first element
    println(numbers[2]) // 3, the last element

    println("---------------------------")

    //------------------------------------
    //access last element of array

    val alphabet = charArrayOf('a', 'b', 'c', 'd')

    val last = alphabet[alphabet.size - 1]    // 'd'
    val prelast = alphabet[alphabet.size - 2] // 'c'
    println("$last , $prelast")

    //OR
    println(alphabet.first())   // 'a'
    println(alphabet.last())    // 'd'
    println(alphabet.lastIndex) // 3

    println("-----------------------------")

    //--------------------------------
    //comparing two arrays
    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3)

    println(numbers1.contentEquals(numbers2)) // true
    println(numbers1.contentEquals(numbers3)) // false

    //-------------

    val simpleArray = intArrayOf(1, 2, 3, 4)
    val similarArray = intArrayOf(1, 2, 3, 4)

    println(simpleArray == simpleArray)  // true, simpleArray points to the same object
    println(simpleArray == similarArray) // false, similarArray points to another object
}