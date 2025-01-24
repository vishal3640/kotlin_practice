import kotlin.random.Random

//Random order

fun main(args : Array<String>)
{
        val numbers = mutableListOf(3, 5, 6, 4, 1, 8, 2, 7)
        val shuffledNumbers = numbers.shuffled()

        println(numbers) // [3, 5, 6, 4, 1, 8, 2, 7]
        println(shuffledNumbers) // [5, 3, 6, 7, 1, 8, 2, 4]

        val words = listOf("racecar", "mom", "dad", "abracadabra", "MANDRAKE")
        val shuffledWords = words.shuffled(Random(1))

        println(words) // [racecar, mom, dad, abracadabra, MANDRAKE]
        println(shuffledWords) // [MANDRAKE, abracadabra, mom, dad, racecar]

}