

    fun main(args : Array<String>) {
        //immutable list
        var lst = listOf("Shubham", "kiran", "Lokhande", "qwsdfg")
        println(lst)

        var lst1 = listOf<String>("Shubham", "kiran", "Lokhande", "qwsdfg") //also specify type of list
        println(lst1)

        //mutable list
        val cars = mutableListOf<String>("BMW", "Honda", "Mercedes")
        println(cars) // output: [BMW, Honda, Mercedes]

        cars[0] = "Reault" //change the mutable list
        println(cars)//[Reault, Honda, Mercedes]

        //-------------------------------
        //empty list
        val staff = emptyList<String>()
        println(staff) // output: []

        //--------------------------------
        //Another way of creating a list is to call a builder function - buildList().
        val names = listOf<String>("Emma", "Kim")

        val list = buildList {
            add("Marta")
            addAll(names)
            add("Kira")
            add(0, "shubham")
            add("omkar")
        }
        println(list) // output: [Marta, Emma, Kim, Kira]


        //------------------------------------------
        //size and isEmpty() function
        val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")
        println("Size of partylist : ${partyList.size}")

        println("partlist is empty : ${partyList.isEmpty()}")

        //---------------------------------
        //get(index) method
        val party = listOf("Fred", "Emma", "Isabella", "James", "Olivia")
        println("index at 4 position : ${party.get(4)}")

        //-----------------------------------
        //iondexOf(element) and contains(element)

        val abc = listOf("Fred", "Emma", "Shubham", "Isabella", "James", "Olivia")
        println("index of shubham is : ${abc.indexOf("Shubham")}")
        println("shubham is in list or not : ${abc.contains("Shubham")}")

        //--------------------------------------------
        //iterating through loop
        print("iterator example : ")
        val prq = listOf("Fred", "Emma", "Shubham", "Isabella")
        for (obj in prq) {
            println("Hello $obj")
        }
        println("==================================")

        //---------------------------
        //indices property

        val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

        for (index in daysOfWeek.indices) {
            println("$index: ${daysOfWeek[index]}")
        }
        println("==================================")

        //-------------------------------------
        //Iterating by range indexes

        for (i in 1..6) {
            println("$i: ${daysOfWeek[i]}")
        }
        println("==================================")

        //we know last index of list

        for (i in 1..daysOfWeek.lastIndex) {
            println("$i: ${daysOfWeek[i]}")
        }


    }