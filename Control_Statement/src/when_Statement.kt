

fun main(args : Array<String>)
{
    var a =11

    when(a){

        1 -> println("a is 1")
        2 ->  {
                println("a is 2")
                println("We also write multiple statements in code blocks")
              }
        3,4 -> println("a 3 is  OR 4") //we also write multiple conditions.

        in 11..20 -> println("a is lies between 11 to 20") //we also use RANGES with 'in' OPERATOR.

        else -> println("unknown number")  //default statement
    }


    //----------------------------------
    //when as Expression

    var x = 22
    var str : String = when(x) {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> "x is unknown"
    }
    println("str is : $str")

    //-----------------------------------------------------
    //when to decide what operation to perform
    println("enter sign : ")
    val op= readln()


    val a1 = 234
    val b = 23

    when (op) {
        "+","plus" -> println(a1 + b)
        "-" -> println(a1 - b)
        "*" -> println(a1 * b)
        else -> println("Unknown operator")
    }

    //----------------------------------
    //when as expression
    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> "Unknown operator"
    }
    println(result)

    //--------------------------------------------
    //Branch conditions and ranges
    println("Enter 3 numbers : ")
    val (var1, var2, var3) = readln().split(" ")

    val a6 = var1.toInt()
    val b6 = var2.toInt()
    val c = var3.toInt()

    println(when (c) {
        a6 + b6 -> "$c equals $a6 plus $b6"
        a6 - b6 -> "$c equals $a6 minus $b6"
        a6 * b6 -> "$c equals $a6 times $b6"
        else -> "We do not know how to calculate $c"
    })
}