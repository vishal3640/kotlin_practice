
    fun main(args: Array<String>){

        var i : Int = 1  //here, i is initialize
        println("print 1 to 10 numbers :")
        while (i <= 10)
        {
            println(i)
            i++
        }

        //-----------------------------
        //print even numbers
        println("print even numbers :")
        var i1 : Int = 1
        while(i1 <= 10)
        {
            if(i1 % 2 == 0)
            { println(i1)}
            i1++
        }

        //---------------------------------------------
        //print A-z
            var letter = 'A'

            while (letter <= 'Z') {
                print("$letter ")
                letter++

        }


    }