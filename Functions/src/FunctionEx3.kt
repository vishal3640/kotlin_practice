
    fun main(args : Array<String>)
    {
        var maxno = max(34,45)
        println("max no. : $maxno")

        var mixno = min(34,23)
        println("min no. : $mixno")
    }

    fun max(a : Int , b : Int) : Int //definition of method
    {
        if(a > b)
            return a
        else
            return b
    }

    //--------------------------------------
    //function as Expression
    fun min(a : Int, b : Int) : Int = if (a< b) a else b
