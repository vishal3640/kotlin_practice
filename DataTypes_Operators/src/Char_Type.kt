

fun main()
{
    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'

    println("$lowerCaseLetter , $upperCaseLetter, $number, $space, $dollar")

     //-----------------------------------------
     // character can also be represented by its hexadecimal code
     val ch = '\u0040' // it represents '@'
     println(ch) // @

     //-------------------------------------
     //convert numbers to characters and vice versa
     var num = 97
     println(num.toChar())

     val ch1 = 'b'
     println(ch1.code)

    //----------------------------------------
    //Retrieving subsequent characters

    val ch4 = 'b'
    val ch2 = ch4 + 1 // 'c'
    val ch3 = ch2 - 2 // 'a'

    println("$ch4 , $ch3 , $ch2")

    //------------------------------------------------
    //use the increment (++) and decrement (--) operators
    var ch5 = 'A'

    ch5 += 10
    println(ch5)   // 'K'
    println(++ch5) // 'L'
    println(++ch5) // 'M'
    println(--ch5) // 'L'

    //--------------------------------
    //Relational operations with characters
    println('a' < 'c')  // true
    println('x' >= 'z') // false

    println('D' == 'D') // true
    println('Q' != 'q') // true because capital and lowercase letters are not the same

    println('A' < 'a')  // true because capital Latin letters are placed before lowercase ones


    //--------------------------------------------
    //other functions
    val one = '1'

    val isDigit = one.isDigit()   // true
    val isLetter = one.isLetter() // false

    println("\n$isDigit , $isLetter")

    val capital = 'A'
    val small = 'e'

    val isLetterOrDigit = capital.isLetterOrDigit() // true

    val isUpperCase = capital.isUpperCase() // true
    val isLowerCase = capital.isLowerCase() // false

    val capitalEString = small.uppercase() // "E"
    val capitalE = small.uppercaseChar()   // 'E'

    println("$isLetterOrDigit , $isUpperCase , $isLowerCase , $capitalEString , $capitalE")
}

