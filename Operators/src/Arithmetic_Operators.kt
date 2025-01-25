
    fun main(){

        println(13 + 25) // prints 38
        println(20 + 70) // prints 90

        println(70 - 30) // prints 40
        println(30 - 70) // prints -40

        println(21 * 3)  // prints 63
        println(20 * 10) // prints 200

        println(8 / 3)  // prints 2
        println(41 / 5) // prints 8

        println(10 % 3) // prints 1 because 10 divided by 3 leaves a remainder of 1
        println(12 % 4) // prints 0 because 12 divided by 4 leaves no remainder

        //--------------------------------------------
        //Complex expressions
        //You can combine arithmetic operations to write complex expressions:

        println(1 + 3 * 4 - 2) // prints 11
        println((1 + 3) * (4 - 2)) // prints 8

        //--------------------------------------------
        //example, here is a program that prints all digits of the number 54 in reverse order. We will use arithmetic operations to extract the digits.

        println(54) // it prints 54
        print(54 % 10) // it prints 4
        println((54 / 10) % 10) // it prints 5

        //-----------------------------------------------
        //Unary operators
        // A unary operator takes a single value as the operand.

        println(+5) // prints 5
        println(+(-5)) // prints -5

        // A unary minus negates a value or expression:
        println(-8)  // prints -8
        println(-(100 + 4)) // prints -104

    }