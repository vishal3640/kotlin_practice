import kotlin.math.roundToInt

//overriding example

open class Transport(val cost: Int) { //base class and open for extending

    open fun getFullInfo(): String { //function open for overriding
        return "$$cost cost"
    }

    fun getTax(): String {
        return "$${(cost * 0.25).roundToInt()} tax"
    }
}

//child class
open class Ship(cost: Int, val color: String) : Transport(cost) {

    override fun getFullInfo(): String { //override the base class function in child class
        return super.getFullInfo() + ", $color color"
    }
}

fun main() {
    val transport = Transport(1000)
    val ship = Ship(2000, "marine")
    println(transport.getFullInfo())
    println(ship.getFullInfo())

    println(ship.getTax())
    println(transport.getTax())
}