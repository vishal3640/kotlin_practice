

fun main(args : Array<String>)
{
    //for immutable set

    val visitors = setOf("Shubham","Shubham","Om","Vivek","Sid")
    println(visitors) //duplicate elements is not printed(shubham)

    //Initialization

    val languages1 = setOf("Marathi","Hindi","English","Kannada")  //OR
    val languages2 = setOf<String>("Marathi","Hindi","English","Kannada")

    //empty set

    val eset = emptySet<String>()
    println("Empty set : $eset")

    //Another way of creating a set is to call a builder function buildSet():
    val letters = setOf<Char>('b', 'c')
    println(letters)

    val set = buildSet<Char> {
        add('a')
        addAll(letters)
        add('d')
    }
    println(set) // output: [a, b, c, d]

    println("------------------------------------------")

    //-------------------------------------------
    //Methods and properties

    val visitor1 = setOf("Andrew", "Mike")

    println("How many people visited our cafe today? ${visitor1.size}") // 2
    println("Was our cafe empty today? It's ${visitor1.isEmpty()}") // Was our cafe empty today? It's false

    //------------------------
    val visitor2 = setOf("Paula", "Tanya", "Julia")

    println("Is it true that Tanya came? It's ${visitor2.contains("Tanya")}") // Is it true that Tanya came? It's true
    println("And what is her index? ${visitor2.indexOf("Tanya")}" ) // And her index is 1

    //-----------------------------------
    val students = setOf("Bob", "Larry")
    println(students.first()) // Bob
    println(students.last()) // Larry

    //-----------------------------
    //joinToString

    val empset = setOf("shubham","kiran","shubham","Asif","omkar")
    println("without Join String : ${empset}")
    println("with Join String : ${empset.joinToString()}")

    //------------------------------
    //containsAll(elements)
    val studentsOfAGroup = setOf("Bob", "Larry", "Vlad")
    val studentsInClass = setOf("Vlad")

    println("Are all the students in the group in class today? It's ${studentsInClass.containsAll(studentsOfAGroup)}")

   //use the "+" operator, or "-" operator
    val productsList1 = setOf("Banana", "Lime", "Strawberry")
    val productsList2 = setOf("Strawberry")

    val finalProductsList1 = productsList1 + productsList2
    println(finalProductsList1) // [Banana, Lime, Strawberry]

    val finalProductsList2 = productsList1 - productsList2
    println(finalProductsList2) // [Banana, Lime]

    //---------------------------------------------------------
    //list to set conversion using toSet() function
    val groceries = mutableListOf("Pen", "Pineapple", "Apple", "Super Pen", "Apple", "Pen")
    println(groceries)
    println(groceries.toSet()) //convert to list to set.[Pen, Pineapple, Apple, Super Pen]

    println("--------------------------------------")

    //--------------------------------------------------
    //Iterating through elements
    val visitor3= setOf("Vlad", "Liza", "Vanya", "Nina")

    for (visit3 in visitor3) {
        println("Hello $visit3!")
    }

}