//custom setter
//
//class Client1 {
//    var name: String = "Unknown"
//    var age: Int = 18
//    var info: String = ""
//        set(value) {
//            field = "Name: $name, Age: $age"
//        }
//
//    init {
//        info = "Name: $name, Age: $age"
//    }
//}
//
//fun main() {
//    val client = Client1()
//    println(client.info) // Name: Unknown, Age: 18
//    client.name = "Lester"
//    client.age = 20
//    client.info = "" // This triggers the setter to update the info field
//    println(client.info) // Name: Lester, Age: 20
//}


//--------------------------------------

class Client2 {
    var name = "Unknown"
        set(value) {
            println("The name is changing. Old value is $field. New value is $value.")
            field = value
        }
}

fun main(args: Array<String>) {
    val client = Client2()
    client.name = "Ann"   // The name is changing. Old value is Unknown. New value is Ann.
    println(client.name)
}
