
fun main(args : Array<String>)
{
    //Printing Boolean values

    println("Boolean Variables : ")

    val t : Boolean = true
    val f = false

    println("$t and $f")

    //----------------------------------------------
    //Reading Boolean values

    //Kotlin 1.4, you can read a Boolean value like this:
    //val b: Boolean = readLine().toBoolean()

    //Kotlin 1.6, you can read a Boolean value like this:

    val b: Boolean = readln().toBoolean()
    println("Reading value : $b")
}