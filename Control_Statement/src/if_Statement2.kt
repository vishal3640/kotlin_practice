

    fun main()
    {
        val a1 = 45
        val b1 = 455
        val max = if (a1 > b1) {
            println("Choose a1")
            a1
        } else {
            println("Choose b1")
            b1
        }

        println("Value of max :$max")

        //-----------------

            println("Enter two numbers :")
            val a = readln().toInt()
            val b = readln().toInt()

            println(if (a == b) {
                "a equal b"
            } else if (a > b) {
                "a is greater than b"
            } else {
                "a is less than b"
            })

        //---------------------------------
        //function expression
         var msg = if(a > 10) "Number is greater than 10"  else "Number is less than or equal to 10"
         println(msg)
    }