//reverse order

fun main(args: Array<String>) {
    //reversed() functions -
    println("reverse functions : ")

    val numbers = mutableListOf(3, 5, 6, 4, 1, 8, 2, 7)
    val reversedNumbers = numbers.reversed()

    println(numbers) // [3, 5, 6, 4, 1, 8, 2, 7]
    println(reversedNumbers) // [7, 2, 8, 1, 4, 6, 5, 3]
    numbers.add(9)
    println(numbers) // [3, 5, 6, 4, 1, 8, 2, 7, 9]
    println(reversedNumbers) // [7, 2, 8, 1, 4, 6, 5, 3]

    val words = listOf("racecar", "mom", "dad", "abracadabra", "MANDRAKE")
    val wordsReversed = words.reversed()

    println(words) // [racecar, mom, dad, abracadabra, MANDRAKE]
    println(wordsReversed) // [MANDRAKE, abracadabra, dad, mom, racecar]

    println("-------------------------------------")

    //-------------------------------------------------
    //-------------------------------
    //asReversed() functions -
    println("asReversed functions : ")

    val numbers1 = mutableListOf(3, 5, 6, 4, 1, 8, 2, 7)
    val numbersAsReversed1 = numbers.asReversed()

    println(numbers1) // [3, 5, 6, 4, 1, 8, 2, 7]
    println(numbersAsReversed1) // [7, 2, 8, 1, 4, 6, 5, 3]

    numbers1.add(9)

    println(numbers1) // [3, 5, 6, 4, 1, 8, 2, 7, 9]
    println(numbersAsReversed1) // [9, 7, 2, 8, 1, 4, 6, 5, 3]

    val words1 = listOf("racecar", "mom", "dad", "abracadabra", "MANDRAKE")
    val wordsAsReversed1 = words.asReversed()
    println(words1) // [racecar, mom, dad, abracadabra, MANDRAKE]
    println(wordsAsReversed1) // [MANDRAKE, abracadabra, dad, mom, racecar]
}