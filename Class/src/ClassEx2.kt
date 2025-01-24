
//creating class and primary constructor .....->

//println() function in main function

/**

        fun main(args : Array<String>)
        {
            var obj = Student()
            obj.name = "Shubha Kiran Lokhnade"
            println("Name : ${obj.name}")
        }

        class Student
        {
            var name : String = "Unknown"
        }

 **/

//----------------------------------
//init block
/**
        fun main(args : Array<String>)
        {
            var obj = Student("Shubha Kiran Lokhnade")
        }

        class Student constructor( name: String)
        {
            init {
                println("Name : ${name}")

            }
        }

**/

//-------------------------------------
//initialization in init block
/**
        fun main(args : Array<String>)
        {
            var obj = Student("Shubha Kiran Lokhnade")
        }

        class Student constructor( _name: String)
        {
            var name : String = "Unknown"

            init {
                this.name = _name
                println("Name : ${name}")

            }
        }
**/

//----------------------------------------------
//OR .....directly no initialization in init block

        fun main(args : Array<String>)
        {
            var obj = Student("Shubha Kiran Lokhnade")
        }

        class Student constructor( name: String)
        {
            init {
                println("Name : ${name}")
            }
        }


