

    fun main(args : Array<String>)
    {
        val one = 1
        val two = 2
        val three = 3
        val four = 4

        val oneIsOne = one == one // true
        val res1 = two <= three // true
        val res2 = two != four  // true
        val res3 = two > four   // false
        val res4 = one == three // false
        val res5 = 12 > 23 //false

        println("$oneIsOne $res1 $res2 $res3 $res4 $res5")

        //--------------------------
        val number = 1000
        val result = number + 10 > number + 9 // 1010 > 1009 is true

        println("result : $result")
    }