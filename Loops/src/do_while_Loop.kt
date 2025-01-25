

    fun main(args : Array<String>)
    {
        println("print 1 to 10 numbers :")
        var i : Int = 1
        do {
            println(i)
            i++
        }while (i <= 10)

        //-----------------------------
        //print even numbers
        println("print even numbers :")
        var i1 : Int = 1
            do{
            if(i1 % 2 == 0)
            { println(i1)}
            i1++
        }while (i1 <= 10)
    }