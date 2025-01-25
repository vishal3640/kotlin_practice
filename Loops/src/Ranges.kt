
fun main()
{
    println(5 in 5..15)  // true
    println(12 in 5..15) // true
    println(15 in 5..15) // true
    println(20 in 5..15) // false
    println(5 in 5..<15)  // true
    println(15 in 5..<15) // false

    //--------------------------
    val range = 100..200
    println(130 in range) // false


    //-------------------------------
    println('b' in 'a'..'c') // true
    println('k' in 'a'..'e') // false

    println("hello" in "he".."hi") // true
    println("abc" in "aab".."aac") // false
}