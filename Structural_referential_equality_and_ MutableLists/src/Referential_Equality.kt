import javax.swing.Box

fun main(args :Array<String>)
{
    val blueBox = Box(3)
    val azureBox = blueBox
    val cyanBox = Box(3)
    println(blueBox == azureBox)  // true
    println(blueBox === azureBox) // true, azureBox points to the same object
    println(blueBox == cyanBox)   // true
    println(blueBox === cyanBox)  // false, cyanBox points to another object

    //-------------------------------

    var two = 2
    var anotherTwo = 2
    println(two === anotherTwo) // true

    //----------------------------------------

    var a: Int = 100
    val anotherA: Int = a
    println(a == anotherA)  // true
    println(a === anotherA) // true
    a = 200
    println(a == anotherA)  // false
    println(a === anotherA) // false
}