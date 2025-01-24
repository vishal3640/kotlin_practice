
    fun main(args : Array<String>)
    {
        println("enter any string : ")
        val line = readln()
        println("string : $line")

        //get numeric data from user.here use toInt()

        println("enter the age ")
        val age = readln().toInt()
        println("age : $age")

        //larger number.here use toLong()

        println("How much is your yacht worth?")
        val cost = readln().toLong()
        println("You entered: ")
        println(cost)

        //toDouble()

        println("Enter any double type number:")
        val number = readln().toDouble()
        println("You entered the number: ")
        println(number)

        // toBoolean()
        println("The earth is flat. Type true or false:")
        val answer = readln().toBoolean()
        println("The earth is flat: ")
        println(answer)

        //Reading multiple values in one line
        println("enter two strings(with space) :")
        val (a, b) = readln().split(" ")
        println(a)
        println(b)
    }