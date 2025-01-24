
import java.util.Scanner

fun main(args : Array<String>)
{
    val sc = Scanner(System.`in`)

    println("Enter name : ")
    val nm = sc.next()

    println("Enter Adr : ")
    val adr = sc.next() // read a whole line, e.g., "Hello, Kotlin"

    println("Enter Age : ")
    val age = sc.nextInt()   // read a number, e.g., 123

    println("Enter Company : ")
    val com = sc.next()   // read a string, e.g., "Hello" , read only single world

    println("Name : $nm")
    println("Adr : $adr")
    println("Age : $age")
    println("Company : $com")

    sc.close()  //close scanner

}