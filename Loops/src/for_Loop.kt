
    fun main(args : Array<String>){

        //print shubham 5 times
        println("print shubham 5 times :")
        for (i in 1..5)
        {
            println("Shubham")
        }

        //print 1 to 10
        println("print 1 to 10 numbers :")
        for (i in 1..10)
        {
            println(i)
        }

        //print even numbers
        println("print even numbers :")
        for (i in 1..10)
        {
            if(i % 2 == 0)
                println(i)
        } //-----------------------------------


        //--------------------------------------
        //print odd numbers
        println("print odd numbers :")
        for (i in 1..10)
        {
            if(i % 2 != 0)
                println(i)
        }

        //---------------------------
        //sum of 1 to 100
        var sum = 0
        for(i in 1..100)
        {
            sum = sum + i
        }
        println(sum)

        //---------------------------------
        //print A to Z
        for(i in 'A'..'Z')
        {
            println(i)
        }

        //----------------

        var abc = "shubham"
        for (ch in abc)
            println(ch)

        //----------------------------
        //Iterating in the backward order
         for(i in 4 downTo 1)
         {
             println(i)
         }

        //------------------------------------
        //Excluding the upper limit
        for(i in 1 until 4)
        {
            println(i)
        }

        //------------------------------------
        //Specifying a step
        for(i in 1..10 step 2)
        {
            println(i)
        }

        //---------------------------
        //print table of 2

        var n = 2
        for(i in 1..10)
        {
                println(n * i)
        }
    }