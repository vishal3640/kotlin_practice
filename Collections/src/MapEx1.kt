
fun main(args : Array<String>)
{
    //for immutable map

    val students = mapOf(
        "shubham" to 1,
        "om" to 2,
        "vivek" to 3
        )
    println("Students with grades : $students")

    //---------------------------------------
    //Map element
    //Pair
    val (name, grade) = Pair("Zhenya", 5)   // easy way to get the first and the second values
    println("Student name is: $name And their grade is: $grade")   // output: Student name is: Zhenya And their grade is: 5

    //----------------------------------------------------
    //first and second

    val p = Pair(2, 3)
    println("${p.first} ${p.second}") // 2 3
    val (first, second) = p
    println("$first $second")         // 2 3

    //-------------------------------

    val (name1, grade1) = "Vlad" to 4
    println("Student name is: $name1 And their grade is: $grade1") // output: Student name is: Vlad And their grade is: 4
}