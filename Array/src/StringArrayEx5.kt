//iterating array using loop

fun main(args: Array<String>) {
    //iterate with for loop
    println("iterate with for loop")

    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (day in daysOfWeek) {
        println(day)
    }

    println("------------------------------------")

    //-----------------------
    //iterate using array.indices property
    println("iterate using array.indices property")

    val daysOfWeek1 = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in daysOfWeek1.indices) {
        println("$index: ${daysOfWeek1[index]}")
    }

    println("-----------------------------------")

    //--------------------------------
    //Iterating by range indexes
    println("Iterating by range indexes")

    val daysOfWeek2 = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in 1..5) {
        println("$index: ${daysOfWeek2[index]}")
    }

    println("-----------------------------------")

    //---------------------------------------------
    //last index
    println("access array.lastIndex")
    for (index in 1 until daysOfWeek2.lastIndex) {
        println("$index: ${daysOfWeek2[index]}")
    }
    println("-----------------------------------")

    //---------------------------------------------
    //printing reverse array

    println("printing reverse array")
    for (index in daysOfWeek2.lastIndex downTo 0)
    // with step 2 ...    for (index in daysOfWeek2.lastIndex downTo 0 step  2)
    {
        println("$index: ${daysOfWeek2[index]}")
    }

    println("--------------------------")

    //-----------------------------------------------------
    //reading array elements
    println("reading array element : ")
    val size = readln().toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        println("enter no. ${i + 1}")
        array[i] = readln().toInt()
    }

    for (i in array.lastIndex downTo 0) {
        print("${array[i]} ")
    }

}
