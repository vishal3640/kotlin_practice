

fun main()
{
    var obj = PersonNew()  //create object of class
    obj.name = "Shubham"   //Initialize
    obj.Display(obj.name) //pass name in fun
}

class PersonNew //create class
{
    var name : String = "" //Declare variable as String
    fun Display(name : String) //function
    {
        println(name)
    }
}