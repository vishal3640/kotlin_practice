
    fun main()
    {
        val numb: Int = try { "abc".toInt() } catch (e: NumberFormatException) { 0 }
        println(numb) // 0

        //--------------------------------
        val number: Int = try { "2a".toInt() } catch (e: NumberFormatException) { 0 }
        finally { println("Inside the finally block") }
        println(number)

        //-------------------------------------
        //idiom

        val string1= "abc"
        val number1 = try {
            string1.toInt()
        } catch (e: NumberFormatException) {
            -1
        }



        val string2 = "abc"
        var number2 = 0 // try to avoid var if possible
        try {
            number2 = string2.toInt()
        } catch (e: NumberFormatException) {
            number2 = -1
        }

    }