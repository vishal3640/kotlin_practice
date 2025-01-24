

fun main()
{
    //find length of nullable tpe variable
            //val name: String? = "Kotlin"
            //val length = name.length // Compilation error

    //correct code -
    val name: String? = "Kotlin"
    val length = if(name != null)name.length else null// Compilation error
    println("name : $name")

}