//predicate example
// Lambdas as predicates (T) -> Boolean
val isEven: (Int) -> Boolean = { x -> x % 2 == 0 }
val isOdd: (Int) -> Boolean = { x -> x % 2 != 0 }
val isPalindrome: (String) -> Boolean = { x -> x.reversed() == x }


fun main(args: Array<String>) {
    println(isEven(2)) // true
    println(isEven(3)) // false
    println(isOdd(4)) //false
    println(isOdd(5)) //true
    println(isPalindrome("racecar")) // true
    println(isPalindrome("potatoes")) // false

    println("----------------------------------")

    //--------------------------------------------
    //using function reference
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // any number is even?
    println(numbers.any { x -> x % 2 == 0 }) // true
    println(numbers.any { isEven(it) }) // true
    println(numbers.any(isEven)) // true

}
