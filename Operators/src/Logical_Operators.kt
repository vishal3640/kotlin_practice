
    fun main(args : Array<String>)
    {
        //NOT Operator
        val f = false // f is false
        val t = !f    // t is true

        println(f)
        println(t)

        //--------------------------
        //AND operator

        val b1 = false && false // false
        val b2 = false && true // false
        val b3 = true && false // false
        val b4 = true && true  // true

        println("AND Output : $b1 , $b2, $b3, $b4 ")

        //--------------------------------------
        //OR operator
        val a1 = false || false // false
        val a2 = false || true  // true
        val a3 = true || false  // true
        val a4 = true || true   // true

        println("OR Output : $a1 , $a2, $a3, $a4")

       //-------------------------------------
       //XOR Operator

        val c1 = false xor false // false
        val c2 = false xor true  // true
        val c3 = true xor false  // true
        val c4 = true xor true   // false

        println("XOR Output : $c1 , $c2, $c3, $c4")

    //--------------------------------------------
        val cold = false
        val dry = true
        val summer = false // suppose it is autumn now

        val hiking = dry && (!cold || summer) // true, let's go hiking!
        println(hiking) //output is true

        //------------------------------------
        val p = false

        val q = "false"

        val r = 't'

        val d= true

        println("$p,$q,$r,$d")
        //--------------------------------------

        val x = readLine().toBoolean() // read other values in the same way

        val y = readLine().toBoolean()

        val z = readLine().toBoolean()

        println(!(x && y) || (z))




    }