import kotlin.math.sqrt


fun main(args : Array<String>)
      {
          var name : String = "Shubham" // OR // var name = "Shubham"
          var isAlive : Boolean = true // OR // var isAlive = true
          var gender : Char = 'M' // OR // var gender = 'M'
          var age : Int = 24 // OR // var age = 24
          var marks : Float = 78.3F // OR // var marks= 78.3F
          var percentage : Double = 67.56 // OR // var percentage = 67.56

          println("name : " + name)
          println("isAlive : " +  isAlive)
          println("gender: " + gender)
          println("age : " + age)
          println("marks : " + marks)
          println("percentage : " + percentage)

          //-----------------------------------
          //Type Conversion
          //Int to Double using toDouble() function -
             val num: Int = 100
             val res: Double = sqrt(num.toDouble())
             println("result : " + res) // 10.0
             println("Input number : " + num) // 100, it is not modified


          //Int to Long
              val bigNum: Long = num.toLong() // 100
              println("long Number : $num")

          //char to int and vice versa

              val n1: Int = 125
              val ch: Char = n1.toChar()  //}
              println("Int to Vhar : $ch")
              val n2: Int = ch.code      // 125
              println("Char to Int : $n2")

          //short and byte
              val floatNumber = 10f
              val doubleNumber = 1.0

              val shortNumber = floatNumber.toInt().toShort() // correct way
              val byteNumber = doubleNumber.toInt().toByte()  // correct way
              println(shortNumber)
              println(byteNumber)

          //any type to string
              val n = 8     // Int
              val d = 10.09 // Double
              val c = '@'   // Char
              val b = true  // Boolean

              val s1 = n.toString() // "8"
              val s2 = d.toString() // "10.09"
              val s3 = c.toString() // "@"
              val s4 = b.toString() // "true"
              println("$s1  $s2  $s3  $s4")

          //string to number
//              val n = "8".toInt() // Int
//              val d = "10.09".toDouble() // Double
//              val b = "true".toBoolean() // Boolean

          //string to several types

              val something = readln() //enter any number

              val d5 = something.toDouble()
              val f5 = d5.toFloat()
              val i5 = f5.toInt()
              val b5 = i5.toByte()

              println(d5)
              println(f5)
              println(i5)
              println(b5)
              println(something.toBoolean())

      }