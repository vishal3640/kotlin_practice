
//all() function

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // all numbers are even?
    println(numbers.all { x -> x % 2 == 0 }) // false
    // all numbers are less than 100
    println(numbers.all { x -> x < 100 }) // true

    val palindromes = listOf("racecar", "mom", "dad", "dog")

    // all are palindromes?
    println(palindromes.all { x -> x.reversed() == x }) // false

    val palindromes2 = listOf("racecar", "mom", "dad")

    // all are palindromes?
    println(palindromes2.all { x -> x.reversed() == x }) // true

    val emptyIntList = emptyList<Int>()

    // all are even?
    println(emptyIntList.all { x -> x % 2 == 0 }) // true

    val emptyStringList = emptyList<String>()

    // all are palindromes?
    println(emptyStringList.all { x -> x.reversed() == x }) // true
}