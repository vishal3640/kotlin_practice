

fun main()
{
    repeat(5)
    {
        println("Shubham")
    }

    //----------------------
    //print current iterator
    repeat(5)
    {
        println(it) //print current iterator
    }

    //-------------------------------------
    //input data and find sum

    println("enter number to calculate it's sum : ")
    var num : Int = readln().toInt()

    var sum : Int = 0

    repeat(num) {
        println("enter ${it+1} number :")  //it means current iteration
        val next = readln().toInt()
        sum += next
    }
       println("Sum : $sum")

    //------------------------------------------------------------
    //here, uses repeat() function
    val msg = "shubham"
    println(msg.repeat(3)) // "HiHiHi"
}