import java.math.BigInteger
import java.util.*


//Interoperability with Java libraries

fun main() {

    println(factorial(21)) // 51090942171709440000
    //--------------------------
    //java's date and time
    val date = Date()
    val time = date.time // Calls the 'getTime' getter method
    date.time = time + 3600000 // Calls the 'setTime' setter method
    println("Date : $date")

    //-----------------------------
    //java's hashmap

    val map = HashMap<String, String>()
    map["key"] = "shubham"

    val value: String = map["key"].toString()
    println("Length : ${value.length}")

    //-------------------------------

    //non-nullable String
    val map1 = HashMap<String, String>()
    map1["key"] = "shubham"

    val value1: String? = map1["key"]
    println("Length : ${value1?.length}")

}


//factorial function with java's BigInteger

fun factorial(n: Int): BigInteger {
    return when (n) {
        0 -> BigInteger.ONE
        else -> BigInteger.valueOf(n.toLong()) * factorial(n - 1)
    }
}

