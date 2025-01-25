////string functions
////substring,substringAfter,substringBefore,substringAfterLast,substringBeforeLast
////replace,replaceFirst,lowercase,uppercase,split, iterate using for loop
//
//fun main(args: Array<String>) {
//    //
//    val greeting = "Hello"
//    println(greeting.substring(0, 3)) // "Hel"
//    println(greeting.substring(1, 3)) // "el"
//    println(greeting.substring(2))    // "llo"
//    println(greeting.substring(4, 5)) // "o"
//
//    println("-------------------------------------")
//    //-----------------------------------
//    //substringAfter and substringBefore functions
//
//    // greeting = "Hello"
//    println(greeting.substringAfter('l'))  // "lo"
//    println(greeting.substringBefore('o')) // "Hell"
//    println(greeting.substringBefore('z', "can't find a character")) // "Hello
//    println("-------------------------------------")
//
//    //--------------------------------------------
//    //substringAfterLast and substringBeforeLast functions
//    // greeting = "Hello"
//    println(greeting.substringAfterLast('l'))  // "o"
//    println(greeting.substringBeforeLast('l',"can't find a character"))
//    println(greeting.substringBeforeLast('z',"can't find a character"))
//
//    println("----------------------------------")
//
//    //-------------------------------------
//    //Replacing parts of a string using replace() function
//    val example = "Good morning..."
//    println(example.replace("morning", "bye")) // "Good bye..."
//    println(example.replace('.', '!'))         // "Good morning!!!"
//
//    //replace function returns a new string without changing the original string
//    val example1 = "Good morning"
//    example1.replace("morning", "bye")
//    println(example1)
//    println("---------------------------------------")
//
//    //-------------------------------------------
//    //replace only the first occurrence
//    val example2 = "one one two three"
//    println(example2.replaceFirst("one", "two")) // "two one two three"
//    println("------------------------------------------------")
//
//    //-----------------------------------------------------
//    //Changing the case lowercase to uppercase and vice versa
//
//    val example3 = "UPPERCASE String"
//    println(example3.lowercase()) // uppercase string
//
//    val example4 = "Lowercase String"
//    println(example4.uppercase()) // LOWERCASE STRING
//
//    println("-------------------------------------------------")
//
//    //------------------------------------------------------
//    //Splitting the string
//
//    val sentence = "a long text"
//    val wordsList: List<String> = sentence.split(", ") // ["a", "long", "text"]
//    println(wordsList)
//
//    val mutableWordList = sentence.split(" ").toMutableList() // MutableList ["a", "long", "text"]
//    println(mutableWordList)
//
//    //--------
//    val number = "+1-213-345-6789"
//    val parts = number.split("-") // ["+1", "213", "345", "6789"]
//    println(parts)
//
//    //---------
//    val text = "That's one small step for a man, one giant leap for mankind."
//    val newparts = text.split(", ") // ["That's one small step for a man", " one giant leap for mankind."]
//    println(newparts)
//
//    //----------
//    val text1 = "I'm gonna be a programmer"
//    val part = text1.split("gonna be") // ["I'm", "a programmer"]
//    println(part)
//    println("----------------------------------------------")
//
//    //------------------------------------------
//    //iterating using for loop
//
//    println("Iterate : ")
//    var name = "shubham kiran lokhande"
//    for (i in name)
//    {
//        print("$i ")
//    }
//
//    //--------------
//    println()
//    //another way
//
//    for (i in 0 until name.length) {
//        print("${name[i]} ") // print the current character
//    }
//
//    //--------------------
//    println()
//    //iterating through an array by indices
//        val rainbow = "ROYGCBV"
//
//        for (index in name.indices){
//            print("${index+1}:${name[index]}  ")
//        }
//
//    //-------------------
//    println()
//    //using toCharArray() and modify the characters during iteration
//
//    val message: String = "Hello, world!"
//    val charArray: CharArray = message.toCharArray()
//
//    for (i in charArray.indices) {
//        if (charArray[i] == 'o') {
//            charArray[i] = 'O' // Replace lowercase 'o' with uppercase 'O'
//        }
//    }
//
//    println(String(charArray)) // Output: HellO, wOrld!
//
//    //--------------
//    println()
//    //specify the number of space is string
//
//    var count = 0
//    for (ch in name) {
//        if (Character.isWhitespace(ch))
//            count++
//    }
//
//    println("Total spaces in name string : $count") // 4
//
//    //--------------
//    println()
//    //another way
//
//
//}

annotation class CustomSuppress(vararg val errorName: String)
fun main() {
    @CustomSuppress("UNUSED_VARIABLE")
    val userName = "Alex"

    // This is also correct
    // because vararg means zero or more arguments
    @CustomSuppress
    val phone = 1234567
}