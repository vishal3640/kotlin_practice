    fun main(args: Array<String>) {
        //for mutable list

        val places = mutableListOf<String>("Paris", "Moscow", "Tokyo")
        println(places)
        places.add("Saint-Petersburg")
        println(places) // output: [Paris, Moscow, Tokyo, Saint-Petersburg]

        //---------------------------
        //initialize
        val cars = mutableListOf("Ford", "Toyota", "Audi", "Audi", "Mazda", "Tesla")
        println(cars) // output: [Ford, Toyota, Audi, Mazda, Tesla]

        println("-------------------------------------")

        //---------------------------------
        //List into a MutableList with the help of the function toMutableList()
        //transform MutableListinto a List, you can use toList():
        val cars2 = listOf("Ford", "Toyota").toMutableList()
        cars2.add("Tesla")
        println(cars2) // output: [Ford, Toyota, Tesla]

        val carsList = cars2.toList()
        println(carsList)

        println("-----------------------------------")

        //-------------------------------------------
        //functions and properties
        val products = listOf("Milk", "Cheese", "Coke")

        val finalList = products.toMutableList()
        finalList.add("Chips")
        finalList[0] = "Water" // or finalList.set(0, "Water")
        println(finalList) // output: [Water, Cheese, Coke, Chips]

        //addAll
        val products1 = mutableListOf("Milk", "Cheese", "Coke")
        val dadsProducts = listOf("Banana", "Watermelon", "Apple")

        products1.addAll(dadsProducts)

        println(products1) // output: [Milk, Cheese, Coke, Banana, Watermelon, Apple]

        println("-----------------------------------")

        //----------------------------------------
        //removeAt(),remove(),clear()
        val products2 = mutableListOf("Milk", "Cheese", "Coke")

        products2.removeAt(0)
        println(products2) // output: [Cheese, Coke]

        products2.remove("Coke")
        println(products2) // output: [Cheese]

        products2.clear()
        println(products2) // output: []

        println("--------------------------------")

        //-----------------------------------------------
        //Iterating through elements
        println("Iterating through elements : ")
        val products3 = mutableListOf("Cheese", "Milk", "Coke")

        for (product in products3) {
            println(product)
        }

        //-------------------------------

    }