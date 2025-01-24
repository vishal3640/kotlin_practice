
    fun main()
    {
        var result = itemPrice(34,0) //Divide by zero exception occurs
        println(result)
        
    }
    //Divide by zero exception
    fun itemPrice(total: Int, amount: Int): Int {
        return total / amount
    }

