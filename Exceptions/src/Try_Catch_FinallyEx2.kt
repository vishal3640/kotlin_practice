
fun main(args : Array<String>)
{
    try {
        println("Inside the try block")
        println(2 / 0) // throws ArithmeticException
    }
    catch (e: Exception) {
        println("Inside the catch block")
    }
    finally {
        println("Inside the finally block")
    }

    println("After the try-catch-finally block")
}