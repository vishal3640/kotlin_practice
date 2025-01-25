
    fun main()
    {
        listOf(1, 2, 3, 4).forEach {
            if (it == 3) return@forEach  // Skipping number 3
            println(it)
        }
        println("End")
    }