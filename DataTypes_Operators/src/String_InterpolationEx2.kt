
 //const val WEEK_DAYS = 7

         fun main(args: Array<String>)
         {
            var obj = Rectangle()
             obj.length = 10
             obj.breath = 5

             println("area of ${obj.length} and ${obj.breath} is ${obj.length * obj.breath}")  //here embed expression

             //val r1 = 1..5 // Ranges or DoubleDot Operators
             //println(r1)

             //var a =1000
             //var b = 12__12  // underscore is allow for more understanding not an error
             //println(a+b)

             //println(WEEK_DAYS) //const val print

             val result = println("Shubham")
             println(result)
         }

          class Rectangle
          {
              //declare variables with initialization
              var length : Int = 0
              var breath : Int = 0
          }