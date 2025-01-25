
    fun main(args : Array<String>)
    {
        println("Break Statement")
        for(i in 1..10)
        {
            println(i)
             if(i==5)
                 break
        }

        //--------------------------------
        //labeled for loop

        println("Break Statement with labeled for loop ")
        myloop@ for(i in 1..3)
        {
            for(j in 1..3){
                println("$i $j")
                    if(i==2 && j==2)
                       break@myloop  //break the outer loop
            }
        }
    }