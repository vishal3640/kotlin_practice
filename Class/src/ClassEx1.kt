//class Patient   ..... //it is valid ,because it has empty body

class Patient   //create class
{
    //declare properties
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

fun main(args: Array<String>) {
    //first object
    var abc = Patient() //create object
    abc.name = "ABC"
    abc.age = 24
    abc.height = 125.0

    println("Name : ${abc.name} , Age : ${abc.age} , Height : ${abc.height}")  //accessing properties

    //-------------------
    //second object
    var pqr = Patient() //create object
    pqr.name = "PQR"
    pqr.age = 25
    pqr.height = 150.0

    println("Name : ${pqr.name} , Age : ${pqr.age} , Height : ${pqr.height}")  //accessing properties

}