

        fun main(args: Array<String>)
        {
            val sum = Add(5, 6)
            println("Total Sum : ${sum.c}") //sum.c is used for String Interpolation
        }

        // primary constructor
        class Add constructor(a: Int,b:Int)
        {
            var c = a+b;
        }
