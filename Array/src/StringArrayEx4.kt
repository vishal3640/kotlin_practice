//string Array

fun main(args: Array<String>) {

    //initialization
    val stringArray1 = arrayOf("array", "of", "strings")

    //or   //specify type
    val stringArray2 = arrayOf<String>("array", "of", "strings")

    //empty array.....require is specify type
    val newEmptyArray = emptyArray<String>()

    //------------------------------------
    //accessing element
    println(stringArray1[2])
    println(stringArray2.joinToString())

    println("----------------------------")

    //-------------------------------
    //set new element
    println(stringArray1.joinToString())
    stringArray1[2] = "shubham"
    println(stringArray1.joinToString())

    println("----------------------------------")

    //--------------------------------------------
    //working with multiple arrays
    val southernCross = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = arrayOf("Ginan", "Mu Crucis")

    val newArray = southernCross + stars
    println(newArray.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

    println("-----------------------------------")

    //--------------------------------------
    //comparing string array
    val firstArray = arrayOf("result", "is", "true")
    val secondArray = arrayOf("result", "is", "true")
    val thirdArray = arrayOf("result")

    println(firstArray.contentEquals(secondArray))  //  true
    println(firstArray.contentEquals(thirdArray))   //  false

    println("------------------------------------------")

    //------------------------------
    //new element adding in empty array
    var southernCross1 = emptyArray<String>()
    southernCross1 += "Acrux"
    southernCross1 += "Gacrux"
    southernCross1 += "Imai"
    println(southernCross1.joinToString())   // Acrux, Gacrux, Imai

    //----------

    var southernCross2 = arrayOf("Acrux", "Gacrux", "Imai")
    southernCross2 += "Mimosa"
    println(southernCross2.joinToString())  //  Acrux, Gacrux, Imai, Mimosa


}
