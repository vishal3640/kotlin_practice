
//secondary constructor.....->

fun main(args : Array<String>)
{
    var obj = Stud("Shubham" , 166032)  //value pass in object
    println("Id : ${obj.id}")       //print id
}

class Stud(var name : String)  //create class and pass property name in primary constructor
{
    var id : Int = -1        //declare property id

    init {                       //init block
        println("Name : $name")  //print name
        println("Id : $id")    //print id=-1, bcoz init block first executed after that
                                               //  secondary constructor is executed
    }

    constructor(_name : String , _id : Int) : this(_name)
             //pass name and id in secondary constructor and point to primary constructor
    {
        this.id = _id    //initialize id
    }
}