
    fun main()
    {
        //other useful functions

        val numbers = mutableListOf(1, 2, 3, 4, 5)
        var sublist = mutableListOf<Int>()
        if (numbers.isNotEmpty() && numbers.size >= 4) {
            sublist = numbers.subList(1, 4)
        }

        println(sublist) // [2, 3, 4]

        //-----------------------

        val numbers1 = mutableListOf(1, 2, 3, 4, 5)

        if (5 in numbers1) {
            println(numbers1.indexOf(5)) // 4
        }

        println(numbers1.indexOf(7)) // -1

      //-----------------------------
        val number = mutableListOf(1, 2, 3, 4, 5)

        val vowels = mutableListOf('e', 'a', 'y', 'i', 'u', 'o')

        println(number.minOrNull()) // 1
        println(number.maxOrNull()) // 5
        println(number.sum())      // 15

        println(vowels.sorted()) // [a, e, i, o, u, y]
        println(vowels.sortedDescending()) // [y, u, o, i, e, a]
    }