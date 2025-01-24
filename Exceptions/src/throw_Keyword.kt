
        fun main()
        {
            var result = calculateSpentMoney(-10,10)
            println("Result : $result")
        }

        fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
            if (total < 0) {
                throw Exception("Total can't be negative")  //here throw an exception
            }
            if (itemPrice < 0) {
                throw Exception("Item price can't be negative") //here throw an exception
            }
            if (itemPrice == 0) {
                return 0
            }
            val amountToBuy = total / itemPrice
            return amountToBuy * itemPrice
        }