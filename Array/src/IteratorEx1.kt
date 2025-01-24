

//iterator

fun main(args : Array<String>)
{
    //iterating using iterator() function

    println("Using iterator() and while() loop : ")
    var set = setOf("cat", "dog", "crocodile", "snake")
    var iterator = set.iterator()

    while (iterator.hasNext()) {
        print(iterator.next() + " ") // cat dog crocodile snake
    }

    println()
    println("----------------------------------------")

    //--------------------------------------
    //Using iterator() and forEach() loop for map collection
    println("Using iterator() and forEach() loop :")

    var map = mapOf("John" to "chocolate", "Mary" to "sweets", "Sara" to "marmalade")
    var iter = map.iterator()

    iter.forEach { (key, value) ->
        println("$key likes $value")
    }

    println("----------------------------------")

    //-----------------------------------------
    //Iterator and mutable collections
    println("Iterator and mutable collections")
    val food = mutableSetOf("donuts", "cakes", "tarts")
    val mutableIterator = food.iterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("Result : $food")// Result: [cakes, tarts]

    println("-------------------------------------")

    //------------------------------------------------
    //List iterator
    val strings = listOf("i", "like", "donuts")
    val listIterator = strings.listIterator()

    println("Iterating forwards:")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

}