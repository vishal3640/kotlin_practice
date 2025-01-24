    //function references
    //4 types  -   1) reference to a function
                // 2) reference by class
               //  3) reference by object
                // 4) reference yo a constructor
    //----------------------------

    //example of 1) reference to a function

//        fun multiply(x: Int, y: Int) = x * y
//
//        fun add(x: Int, y: Int) = x + y
//
//        fun main() {
//            val operatorMultiply: (Int, Int) -> Int = ::multiply
//            val operatorAdd: (Int, Int) -> Int = ::add
//            operatorMultiply(10, 5) // 50
//            operatorAdd(5, 4) // 9
//        }

    //----------------------------
    //another example
    fun isOdd(x: Int) = x % 2 != 0

    fun isEven(x: Int) = x % 2 == 0

    fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
        for (number in numbers) {
            if (filter(number))
                print("$number ")
        }
    }

    fun main() {
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val oddFunction = ::isOdd
        print("Odd numbers: ")
        printNumbers(numbers, oddFunction)
        print("\nEven numbers: ")
        printNumbers(numbers, ::isEven)
    }

    //------------------------------
    //another example
    // A function that adds two integers
//            fun add(a: Int, b: Int): Int {
//                return a + b
//            }
//
//            // A function that takes a function reference as a parameter
//            fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
//                return operation(a, b)  // Calls the referenced function
//            }
//
//            fun main() {
//                // Using a function reference
//                val result = calculate(5, 10, ::add)  // Reference to the 'add' function
//                println("Result of addition: $result")  // Output: Result of addition: 15
//            }

    //--------------------------------------
