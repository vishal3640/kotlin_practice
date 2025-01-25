
    fun main(args : Array<String>)
    {

        for (i in 1..10)
        {
           if(i == 5)
               continue  // here, 5 is not printed
            println(i)

        }

        //---------------------------
        //print the odd numbers
        println("print the odd numbers : ")
        for (i in 1..10)
        {
            if(i % 2 == 0)
                continue  // here, 5 is not printed
            println(i)

        }

        //------------------------------------
        println("continue Statement with labeled for loop ")
        myloop@ for(i in 1..3)
        {
            for(j in 1..3){
                if(i==2 && j==2)
                    continue@myloop  //continue the outer loop
                println("$i $j")

            }
        }
        println("Hello")
    }

