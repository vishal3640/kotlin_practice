

fun main()
{
    var obj = PersonNew2()  //create object of class
    obj.name = "Shubham"   //Initialize

    println("My Name is ${obj.name}")
}

class PersonNew2 //create class
{
    var name: String = "" //Declare variable as String
}