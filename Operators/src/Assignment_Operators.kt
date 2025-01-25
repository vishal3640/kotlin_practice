
fun main(){

    var a = 3
    a = a + 1 // 4
    a = a - 1 // 3
    println("a : $a")

    //---------------

    a += 2 // 5
    a -= 2 // 3
    a *= 2 // 6
    a /= 2 // 3
    a %= 2 // 1
    println("a : $a")

    //-----------------------------------
    //Using increment and decrement

    var num = 3
    num++  // 4, increment
    println("Result : $num")
    num--  // 3, decrement
    println("Result : $num")

    //------------------------------------------------
    //Prefix Form
    var a2 = 10
    val b2 = ++a2
    println(a2)  // a = 11
    println(b2)  // b = 11

    var a1 = 10
    val b1 = --a1
    println(a1)  // a = 9
    println(b1)  // b = 9

    //Postfix Form
    var a3 = 10
    val b3 = a3++
    println(a3)  // a = 11
    println(b3)  // b = 10

    var a4 = 10
    val b4 = a4--
    println(a4)  // a = 9
    println(b4)  // b = 10

}