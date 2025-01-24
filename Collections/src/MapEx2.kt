
fun  main(args : Array<String>) {
    //for immutable map

    //Initialization

    val staff1 = mapOf<String, Int>("John" to 1000)
    val staff2 = mapOf("Mike" to 1500)

    //empty map
    val emptyStringToDoubleMap = emptyMap<String, Double>()

    //-------------------------
    //Another way of creating a map is to call a builder function buildMap():
    val values = mapOf<String, Int>("Second" to 2, "Third" to 3)
    println(values)

    val map = buildMap<String, Int> {
        put("First", 1)
        putAll(values)
        put("Fourth", 4)
    }
    println(map) // output: {First=1, Second=2, Third=3, Fourth=4}

    //----------------------------------------
    //methods and properties
    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    if (!employees.isEmpty()) {
        println("no. of emp : ${employees.size}")
        println("Mike wants to earn : ${employees["Mike"]}")
    }

    //----------------

    val isWanted = employees.containsKey("Jim")
    println("Does Jim want to be our employee? It's $isWanted")

    //------------------
    val isAnyoneWilling = employees.containsValue(500)
    println("Is anyone willing to earn $500? It's $isAnyoneWilling")
    println("=====================")

    //-------------------------------
    //iterating using loop
    val employee = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    for (emp in employee)
        println("${emp.key} ${emp.value}")

    println("=====================")

    for ((k, v) in employee)
        println("$k $v")

    println("=====================")

    for ((k, v) in employee) {
        println("$k -> $v")
    }
    println("=====================")

    //--------------------------------
    //Idioms

    val map1 = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map1.get("a")) // 1
    println(map1["b"])     // 2, idiomatic way
}