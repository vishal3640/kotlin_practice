
        fun main()
        {
        //    fun(a: Int, b: Int): Int
        //    {
        //        return a * b
        //    } // normal function but no name

        //    { a: Int, b: Int -> a * b } // we shifted the parameter or argument in the curly braces

            val mul1 = fun(a: Int, b: Int): Int {
                return a * b
            }  //anonymous function

            val mul2 = { a: Int, b: Int -> a * b }  //lamda expression

            println(mul1(2, 3))  // prints "6"
            println(mul2(2, 3))  // prints "6" too



        }