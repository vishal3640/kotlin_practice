
    fun main()
    {
            var result = itemPrice1(34,0) //Divide by zero exception occurs
            println(result)
    }
    
    //Divide by zero exception prevents
    fun itemPrice1(total: Int, amount: Int): Int {
        if(amount == 0)
        {
            println("Division by zero")
            return 0
        }
        return total / amount
    }