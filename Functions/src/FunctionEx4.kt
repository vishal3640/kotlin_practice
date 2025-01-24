
/**
 * The function returns its argument
 */
fun identity(a: Int): Int {
    return a
}

/**
 * The function returns the sum of two Ints
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * The function just returns 3
 */
fun get3(): Int {
    return 3
}

fun add3(a: Int): Int {
    return identity(a) + get3()
}

// function extracts the last digit of a number

fun extractdigit(a : Int) : Int
{
    return a % 10
}

//check number isPositive or not

fun isPositive(a : Int): Boolean
{
    return a > 0
}
fun main() {
    println(identity(1000)) // 1000
    println(sum(200, 300))  // 500
    println(get3())         // 3
    println(add3(5))        // 8

    var digit = extractdigit(45456)
    println("Last digit of number : $digit")

    var check = isPositive(456)
    println("Number is positive : $check")
}