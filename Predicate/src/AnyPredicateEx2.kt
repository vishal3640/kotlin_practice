//any() function

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //any number is even
    println(numbers.any { x -> x % 2 == 0 })

    //any number is greater than 100
    println(numbers.any { x -> x > 100 })

    //any string is palindrome?
    val pali = listOf("shubham", "racecar")
    println(pali.any { x -> x.reversed() == x })
}
