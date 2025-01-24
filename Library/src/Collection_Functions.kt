fun main(args: Array<String>) {
    //collection functions ; filter,map,reduce

    val numbers = listOf(1, 2, 3, 4, 5)

    val square = numbers.map { it * it }
    println("Square of numbers : $square")

    val evenno = numbers.filter { it % 2 == 0 }
    println("Even numbers : $evenno")

    val product = numbers.reduce { acc, i -> i * acc }
    println("Product of all numbers : $product")
}