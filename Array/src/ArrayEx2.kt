fun main(args: Array<String>) {
    //Reading array from input

    println("Enter numbers : ")
    var numbers = IntArray(5) { readln().toInt() }
    println("Numbers from user : ${numbers.joinToString()}")

    //reading array using split() function

    // here we have an input string "1 2 3 4 5"

    println("Enter numbers : ")  //numbers enter with space not enter
    val numbers1 = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(numbers1.joinToString()) // 1, 2, 3, 4, 5

    println("------------------------")

    //--------------------------
    //using regular expression
    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6

    println("----------------------------")

    //-----------------------------
    //array size

    val numbers4 = intArrayOf(1, 2, 3, 4, 5)
    println("Size of array : ${numbers4.size}") // 5

    println("------------------------")

    //--------------------------
    //
    val numb = setOf(1, 2, 3)
    println(numb.map { it * 3 })
    println(numb.mapIndexed { idx, value -> value * idx })


}