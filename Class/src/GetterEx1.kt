//custom getter

class Client {
    var name: String = "Unknown"
    var age: Int = 18
    var info: String = ""
        get() {
            return "name = $name, age = $age"
        }
}


fun main() {
    val client = Client()
    println(client.info) // name = Unknown, age = 18
    client.name = "Lester"
    client.age = 20
    println(client.info) // name = Lester, age = 20
}