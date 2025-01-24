
//nested classes

//        class CatEx(val name: String) {
//            inner class Bow(val color: String) {
//                fun printColor() {
//                    println("The cat named $name has a $color bow.")
//                }
//            }
//        }
//
//        fun main() {
//            val cat: CatEx = CatEx("Bob")
//            val bow: CatEx.Bow = cat.Bow("red")
//
//            bow.printColor()
//        }

//-----------------------------------------

        class CatEx(val name: String) {
            fun sayMeow() {
                println("$name says: \"Meow\".")
            }

            inner class Bow(val color: String) {
                fun putOnABow() {
                    println("Putting on the $color bow on $name.")
                    sayMeow()
                    println("The bow is on!")
                }

                fun printColor() {
                    println("The cat named $name has a $color bow.")
                }
            }
        }

        fun main() {
            val cat: CatEx = CatEx("Princess") // Corrected from Cat to CatEx
            val bow: CatEx.Bow = cat.Bow("golden") // Corrected from Cat.Bow to CatEx.Bow

            bow.printColor()
            bow.putOnABow()
        }
