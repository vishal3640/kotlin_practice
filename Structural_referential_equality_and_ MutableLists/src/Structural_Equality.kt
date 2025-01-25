import javax.swing.Box

fun main(args: Array<String>)
{
    val blueBox = Box(3)         // box with 3 balls
    val azureBox = blueBox
    println(blueBox == azureBox ) // true, it's a copy
 //   blueBox.addBall()             // add a ball to the first box
    println(blueBox == azureBox ) // true, the second box also contains 4 balls
}