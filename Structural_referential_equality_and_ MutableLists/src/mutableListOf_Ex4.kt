
fun main()
{
    //changing the list using function

    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    var stars = mutableListOf("Ginan", "Mu Crucis")
    southernCross[1] = "star"  //change data at index 1
    stars[1] = "star"

    println(southernCross[1]) // star
    println(stars[1]) // star

    //----------------------------------------

   // val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    //val stars = mutableListOf("Ginan", "Mu Crucis")
    val names = mutableListOf("Jack", "John", "Katie")
    val food = mutableListOf("Bread", "Cheese", "Meat")
    val fruits = mutableListOf("Apple", "Banana", "Grape", "Mango")

    southernCross.removeAt(0)
    southernCross.remove("Mimosa")

    stars.add("New star")
    stars.add(0, "First star")

    names.clear()

    food.addAll(fruits)

    println(names) // []
    println(southernCross.joinToString()) // Gacrux, Imai
    println(stars.joinToString()) // First star, Ginan, Mu Crucis, New star
    println(food.joinToString()) // Bread, Cheese, Meat, Apple, Banana, Grape, Mango


    //-----------------------------------
    //Also, you can use += to add new elements to the list:
    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
    val intList1 = mutableListOf(1, 2, 3, 4, 5)
    val intList2 = mutableListOf(5, 4, 3, 2, 1)

    vowels += 'y'
    intList1 += intList2

    println(vowels)   // [a, o, i, e, u, y]
    println(intList1) // [1, 2, 3, 4, 5, 5, 4, 3, 2, 1]
}