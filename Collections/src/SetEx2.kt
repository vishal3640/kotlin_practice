

fun main(args : Array<String>)
{
    //for mutable set

    val groceries = mutableSetOf("banana","apple","lemon")
    println(groceries)
    groceries.add("water") //add element in mutable set
    println(groceries)

    println("-------------------------------")

    //----------------------------
    //duplicates not allow
    val groceries1 = mutableSetOf("banana","apple","lemon")
    println(groceries1)
    groceries1.add("banana") //duplicate element is not allowed in mutable set
    println(groceries1)

    //---------------------------
    //initialize
    val students = mutableSetOf("Joe", "Elena", "Bob")
    println(students) // [Joe, Elena, Bob]

    //-------------------------
    //empty mutable set
    val points = mutableSetOf<Int>()
    println(points) // []

    //-----------------------------------
    // transform Set into a MutableSet using
    val students1 = setOf("Joe", "Elena", "Bob").toMutableSet()
    students1.add("Bob")
    students1.add("Shubham")
    println(students1) // [Joe, Elena, Bob]

    //---------------------------------------------
    //properties and methods
    val words = mutableSetOf<String>("Apple", "Coke")
    val friendsWords = mutableSetOf<String>("Banana", "Coke")

    words.add("Phone")
    words.add("Controller")

    friendsWords.add("Phone")
    friendsWords.add("Pasta")
    friendsWords.add("Pizza")

    words.addAll(friendsWords)

    println(words) // [Apple, Coke, Phone, Controller, Banana, Pasta, Pizza]

    //------------------------------------------------
    //remove(),removeAll().,clear()
    val groceries5 = mutableSetOf("Apple", "Water", "Banana", "Pen")

    println(groceries5)
    groceries5.remove("Apple")
    println(groceries5) // [Water, Banana, Pen]

    val uselessGroceries = setOf("Banana", "Pen")
    groceries5.removeAll(uselessGroceries)
    println(groceries5) // [Water]

    groceries5.clear()
    println(groceries5) // []

    println("-----------------------------------")
    //----------------------------------------
    //Iterating through elements
    println("Iterating through elements : ")
    val places = mutableSetOf("Saint-Petersburg", "Moscow", "Grodno", "Rome")

    for (place in places) {
        println(place)
    }

    //---------------------------------

}