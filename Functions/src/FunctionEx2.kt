

    fun main(args : Array<String>)
    {
        add()  //call add() method

        var subres = sub(45,32)
        println("Sub : $subres")
    }

    fun add() //definition of method
    {
        var a = 23
        var b = 45

        var sum = a + b
        println("Sum : $sum")
    }

//----------------

        fun sub(a : Int , b : Int) : Int //definition of method
        {
            return a - b
        }