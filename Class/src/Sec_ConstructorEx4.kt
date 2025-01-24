//secondary or custom constructor

class Size4 {
    var width: Int = 0
    var height: Int = 0

    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }
}

fun main(args: Array<String>) {

    val size1 = Size4(7) // uses 1st constructor
    println("Area of 1 : ${size1.width * size1.height}")

    val size2 = Size4(2, 7) // uses 2nd constructor
    println("Area of 2 : ${size2.width * size2.height}")

    val size3 = Size4(0, 7.0) // uses 3rd constructor
    println("Area of 3 : ${size3.width * size3.height}")

    val size4 = Size4(7.0, 2) // uses 4th constructor
    println("Area of 4 : ${size4.width * size4.height}")

}
