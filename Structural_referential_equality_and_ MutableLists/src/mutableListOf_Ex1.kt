
fun main()
{
    val abc1 = mutableListOf("AB","CD","EF")
    val abc2 = mutableListOf("GH","IJ","KL")
    val newlist = abc1 + abc2 //join two lists
    println(newlist)
    println(newlist.joinToString())
    println(newlist.joinToString("->"))
    println(newlist.joinToString("-"))
    println(newlist.joinToString("/"))
    println(newlist.joinToString("[]"))
}