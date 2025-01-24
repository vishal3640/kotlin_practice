
import  kotlin.random.Random

fun main(args : Array<String>)
{
    //random number

    val diceRoll = Random.nextInt(1, 12127)
    println("You rolled: $diceRoll")

}