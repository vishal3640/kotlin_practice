

    fun main(arhs : Array<String>)
    {
        println("String Functions")

        // Length Function -

        var str : String = "Gyri InfoTech"
        println("Length of String is  : ${str.length}") //string length

      //===========================================================================

        //concat two string

        var str1 = "Hello"
        var str2 = "Gyri"
        var str3 = str1 + str2
        println("Concat String1 is : $str3")

        //---------------------------------------

        val one = "1"
        val two = "2"
        val twelve = one + two
        println(one)      // 1, no changes
        println(two)      // 2, no changes
        println(twelve)   // 12

        //---------------------------------------
        val firstName = "John"
        val lastName = "Smith"
        val fullName = firstName + " " + lastName
        println(fullName)

        //--------------------------------------------
        //Appending values to strings
        val stringPlusBoolean = "abc" + 10 + true
        println(stringPlusBoolean) // abc10true

        val code = "123" + 456 + "789"
        println(code) // 123456789

        val stringAndNumbers = "abc" + 11 + 22 //First, it appends 11 to the string "abc", and then it appends 22 to the string "abc11".
        println(stringAndNumbers) // abc1122

        //---------------------------------------------------------
        //concatenate a character with a String to get a new String:

        val charPlusString = 'a' + "bc"
        println(charPlusString) // abc
        val stringPlusChar = "de" + 'f'+ 'd' + "shubham"
        println(stringPlusChar) // def

        //=============================================================================

         //Repeating the string

        var str5 : String = "Shubham"
        println("Repeat String  : ${str5.repeat(5)}")

        println("Eat. Sleep. Code.\n".repeat(5))

        //===============================================================================

        //Raw string and Escape Sequence

        // prints 'H' is the first letter of "Hello world!" string.
        println("\'H\' is the first letter of \"Hello world!\" string.")

        //-------------------------
        //A raw string can contain newlines and any other characters. You just need to wrap the text in triple quotes ("""):
        val largeString = """
        This is the house that Jack built.
          
        This is the malt that lay in the house that Jack built.
           
        This is the rat that ate the malt
        That lay in the house that Jack built.
           
        This is the cat
        That killed the rat that ate the malt
        That lay in the house that Jack built.
    """.trimIndent() // removes the first and the last lines and trims indents

        print(largeString)


    }