


fun main(args : Array<String>)
{
    //Accessing characters

    val greeting = "Hello"

    val first = greeting[0]  // 'H'
    val second = greeting[1] // 'e'
    val five = greeting[4]   // 'o'

    println("$first, $second , $five")

   //----------------------------

    val last = greeting[greeting.length - 1] // 'o'
    val prelast = greeting[greeting.length - 2] // 'l'

    println("$last , ${prelast}")

    //---------------------------------------

    println(greeting.first())   // 'H'
    println(greeting.last())    // 'o'
    println(greeting.lastIndex) // 4

    //-----------------------------------
    //empty string
    val emptyString = ""
    println(emptyString.length == 0) //true
    println(emptyString.isEmpty()) //true

    //-----------------------------------
    //comparing two strings
    val firs = "first"
    val secon = "second"
    var str = "first"

    println(firs == str)    // true
    println(firs == secon) // false
    println(firs != secon) // true

    var ch = firs[0]
    println(ch) // true

}