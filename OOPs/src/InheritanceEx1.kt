//Inheritance example

open class Book(val pages: Int, val author: String, val cost: Float) {
    fun getInfo(): String {
        return "Pages : $pages , Author : $author , Cost : $cost"
    }
}

class Comics(pages: Int, author: String, cost: Float) : Book(pages, author, cost)


//------------------------------
//another example

class Booklet(pages: Int, cost: Float) : Book(pages, "", cost) {
    fun getUSDCost(): String {
        return "$$cost cost"
    }

    fun getEuroCost(): String {
        return "€$cost cost"
    }
}

fun main(argss: Array<String>) {
    val obj = Comics(123, "Kolhapurkar", 234.56F)
    println(obj.getInfo())

    println("-----------------")

    //--------------------------
    //another examples in pass data

    val centralBooklet = Booklet(5, 0.14F)
    println(centralBooklet.getUSDCost())
    println(centralBooklet.getEuroCost())
}