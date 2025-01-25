//none() function

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //none of the number is even
    println(numbers.none { x -> x % 2 == 0 })

    //none number is greater than 100
    println(numbers.none { x -> x > 100 })

    //none string is palindrome?
    val pali = listOf("shubham", "racecar")
    println(pali.none { x -> x.reversed() == x })

    // none is a palindrome?
    val palindromes2 = listOf("cat", "dog")
    println(palindromes2.none { x -> x.reversed() == x }) // true
}


