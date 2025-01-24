
    fun main(args : Array<String>)
    {
        println("Before Try block")
        try {
            println("Shubham")
            println(2 / 0 ) //here, exception is occur
            println("Lokhande") //not print , because exception is occurs in before this line
                                //go in catch block
         }catch (e : ArithmeticException)
         {
             println(e.message)  /// by zero
             println("Dive By Zero Exception is occurs.") // it will be printed
         }

        println("After the try-catch block") // it will be printed

    }