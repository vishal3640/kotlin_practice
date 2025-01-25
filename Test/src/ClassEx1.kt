import java.awt.DisplayMode

fun main()
{
    var name : String //declare variable as String
    name = "Shubham" //Initialize Variable

    var obj = Person()  //create object of class
    obj.Display(name) //pass name in fun
}

class Person //create class
{
    fun Display(name: String) //function
    {
        println(name)
    }
}