

fun main(args : Array<String>)
{
    //for mutable map

    val staff = mutableMapOf(
        "John" to 500,
        "Mike" to 1000,
        "Lara" to 1300
    )

    println(staff) // output: {John=500, Mike=1000, Lara=1300}

    staff["Nika"] = 999 //add new data in map

    println(staff) // output: {John=500, Mike=1000, Lara=1300, Nika=999}

    println("----------------------------------")

    //--------------------------------------------------------
    //Initialization

    val students = mutableMapOf<String, Int>("Nika" to 19, "Mike" to 23)
    println(students) // output: {Nika=19, Mike=23}

    val carsPerYear1 = mutableMapOf(1999 to 30000, 2021 to 202111)
    println(carsPerYear1) // output: {1999=30000, 2021=202111}

    //map to mutablemap conversion
    val mapCarsPerYear2 = mapOf(1999 to 30000, 2021 to 202111)
    val carsPerYear2 = mapCarsPerYear2.toMutableMap()  //convert using toMutableMap() function
    carsPerYear2[2020] = 2020  //add new data
    println(carsPerYear2) // output: {1999=30000, 2021=202111, 2020=2020}}

    println("----------------------------------")

    //--------------------------------------------
    //add data in map using put() function
    val groupOfStudents = mutableMapOf<String, Int>() // empty mutable map
    groupOfStudents.put("John", 4)
    groupOfStudents["Mike"] = 5
    groupOfStudents["Anastasia"] = 10

    val studentsFromOregon = mapOf("Alexa" to 7)

    groupOfStudents.putAll(studentsFromOregon)

    println(groupOfStudents) // output: {John=4, Mike=5, Anastasia=10, Alexa=7}

    println("----------------------------------")

    //--------------------------------------
    //overwrite the data
    val groceries = mutableMapOf<String, Int>()

    groceries["Potato"] = 5
    println(groceries)  // output: {Potato=5}

    groceries["Potato"] = 10
    println(groceries)  // output: {Potato=10}

    println("-------------------------------------------")

    //=======================================
    //add an element to a map using the plusAssign operator

    val grocerie = mutableMapOf<String, Int>()

    grocerie += mapOf("Potato" to 5)
    grocerie += "Sprite" to 1

    println(grocerie)  // output: {Potato=5, Sprite=1}

    println("----------------------------------------")

    //----------------------------------------------
    //removing the element
    val grocerie1 = mutableMapOf(
        "Potato" to 10,
        "Coke" to 5,
        "Chips" to 7
    )

    grocerie1.remove("Potato")
    println(grocerie1) // output: {Coke=5, Chips=7}

    grocerie1.clear()
    println(grocerie1) // output: {}

    println("----------------------------------------")

    //--------------------------------
    //remove an element from the map using the minusAssign operator
    val cars = mutableMapOf<String, Double>()
    cars["Ford"] = 100.500
    cars["Kia"] = 500.15

    println(cars)  // output: {Ford=100.5, Kia=500.15}

    cars -= "Kia"
    println(cars)  // output: {Ford=100.5}
}