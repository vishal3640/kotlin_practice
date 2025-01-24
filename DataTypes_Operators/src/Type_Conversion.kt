
    fun main(args : Array<String>)
    {
        //Int to Long:
        val num: Int = 100
        val longNum: Long = 1000
        val result = num + longNum // 1100, Long
        println("Result in Long : $result")

        //Long to Double:
        val bigNum: Long = 100000
        val doubleNum: Double = 44.044
        val bigFraction = bigNum - doubleNum // 99955.956, Double
        println("Result in Double : $bigFraction")

        //Byte and Byte:
        val one: Byte = 1
        val two: Byte = 2
        val three = one + two // 3, Int
        println("Result in Int : $three")

        //short and short:
        val fourteen: Short = 14
        val ten: Short = 10
        val four = fourteen - ten // 4, Int
        println("Result in Int : $four")

        //short and byte:
        val hundred: Short = 100
        val five: Byte = 5
        val zero = hundred % five // 0, Int
        println("Result in Int : $zero")


    }