

fun main()
{
    val number1 = 2
    var msg = when(number1)
                {
                   1-> "one"
                   2-> "Two"
                   3-> "Three"
                   else -> "unknown number"
                }
    println(msg)

    //----------------------------
    //Using "when" with ranges and conditions

    val number = 150

    when {
        number < 0 -> println("Negative number")
        number in 1..10 -> println("Number between 1 and 10")
        number % 2 == 0 -> println("Even number")
        else -> println("Odd number greater than 10")
    }

}