
fun main() {

    println("String Templates OR Add $ sign to variable in string\n")

    val city = "Paris"
    val temp = "24"
    println("The temperature in " + city + " is " + temp + "degrees Celsius.") //not use here $ sign

    println("The temperature in $city is $temp degrees Celsius.")//here use $ sign

    //-----------------------------------
    val value = "55"
    val currency = "dollars"
    val price = "$value $currency" // "55 dollars"
    println("Total Price : $price")


    //================================================================================
    //Templates for expressions

    val language = "Kotlin"
    println("$language has ${language.length} letters in the name")

    println("Have a nice $language!")        // nice code
    println("Have a nice" + language + "!") // bad practice


}