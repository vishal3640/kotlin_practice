
fun main()
{
    //changing content of list

    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    var stars = mutableListOf("Ginan", "Mu Crucis")

    println(southernCross)
    println(stars)

    //after changing the list at index 1

    southernCross[1] = "star"
    stars[1] = "star"

    println(southernCross[1]) // star
    println(stars[1]) // star

    println(southernCross)
    println(stars)

}