

fun main(args : Array<String>)
{
   //String Functions split,substring

    val  str = "Shubham Kiran Lokhande"

    val words = str.split(", ")
    println(words)

    val substring = str.substring(0, 5)
    println("Substring : $substring")
}