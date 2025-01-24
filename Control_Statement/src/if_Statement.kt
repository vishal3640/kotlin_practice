
    fun main(args : Array<String>)
    {
        var a = 34
        var b = 45

        var max : Int

        if(a > b)
            max = a
        else
            max = b

        println("Max value is $max")

        //--------------------------------
        //if expression

        var c = 46
        var d = 4

        var max2 : Int = if (c > d) {c} else {d}  //single line expression

        println("Max2 value : $max2")

        //-----------------------------------------
        //if condition has multiple lines of code

        var min : Int = if (c < d) {
                              println("min value $c")
                               c
                            }
                        else{
                            println("min value $d")
                            d
                        }
        println("Min value is $min")


    }