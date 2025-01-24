
//add dependencies in project to execute this code

//1) kotlinx.coroutines library

/***
     import kotlinx.coroutines.*

     fun main() = runBlocking {
     launch {
     delay(1000L)
     println("World!")
     }
     print("Hello, ")
     }

  **/

//---------------------------------------
//2) kotlinx.serialization:

/***
        import kotlinx.serialization.*
        import kotlinx.serialization.json.*

        @Serializable
        data class Person(val name: String, val age: Int)

        fun main() {
        val person = Person("Omar", 20)
        val jsonString = Json.encodeToString(person)
        println(jsonString) // Outputs: {"name":"Omar","age":20}

        val person2 = Json.decodeFromString<Person>(jsonString)
        println(person2)   // Outputs: Person(name=Omar, age=20)
        }
 ***/

//-------------------------------------
//3) kotlinx.datetime

/***
        import kotlinx.datetime.*

        fun main() {
        val currentMoment = Clock.System.now()
        println(currentMoment) // Outputs the current moment in ISO-8601 format

        val today = LocalDate.todayAt(TimeZone.currentSystemDefault())
        println(today) // Outputs today's date
        }
 ***/

//---------------------------------------
//---------------------------------------
//JUnit :  This is a popular testing framework for Java, and
//         it's fully compatible with Kotlin. It provides annotations to
//         identify test methods and contains assertions for testing expected results.

/***
        import org.junit.jupiter.api.Assertions.assertEquals
        import org.junit.jupiter.api.Test

        class MyTest {

        @Test
        fun additionTest() {
        val sum = 2 + 2
        assertEquals(4, sum)
        }
        }
 ***/
//---------------------------------------------------
//Ktor - it is official framework for building asynchronous servers and clients in connected systems.
/***
        import io.ktor.application.*
        import io.ktor.response.*
        import io.ktor.routing.*
        import io.ktor.server.engine.*
        import io.ktor.server.netty.*

        fun main() {
        embeddedServer(Netty, port = 8080) {
        routing {
        get("/") {
        call.respondText("Hello, World!")
        }
        }
        }.start(wait = true)
        }
 ***/

//----------------------------------------------------
//Retrofit :  This is a type-safe HTTP client for Android and Java.
//            It allows you to turn your HTTP API into a Kotlin interface by
//            using annotations to describe the HTTP requests.

/***

         //define an interface for your API :

        interface MyApi {

        @GET("users/{user}/repos")
        suspend fun listRepos(@Path("user") user: String): List<Repo>
        }

        //------------------
        //create a Retrofit instance and use it to create an implementation

        val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build()

        val api = retrofit.create(MyApi::class.java)

        val repos = api.listRepos("octocat")
 ***/

//----------------------------------------
// Exposed : This is a lightweight SQL library for Kotlin created by the JetBrains team.
//           It provides a typesafe SQL interface allowing you to work with databases in a
//           more Kotlin-idiomatic way.

/***
        Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;", driver = "org.h2.Driver")

        transaction {
        SchemaUtils.create(Users)

        Users.insert {
        it[name] = "John"
        it[age] = 27
        }

        Users.select { Users.age greaterEq 27 }.forEach {
        println("${it[Users.name]} is ${it[Users.age]} years old")
        }
        }
 ***/