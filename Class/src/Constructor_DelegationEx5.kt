//constructor delegation

class Size5(val width: Int, val height: Int) {
    var area: Int = width * height

    // Secondary constructor
    constructor(width: Int, height: Int, outerSize: Size5) : this(width, height) {
        outerSize.area -= this.area
        println("Updated outer object's area is equal to ${outerSize.area}")
    }
}

fun main() {
    // Create an outer object
    var outerObj = Size5(10, 10)
    println("Initial outer object's area: ${outerObj.area}")

    // Create an inner object with the secondary constructor
    var innerObj = Size5(3, 4, outerObj)
    println("Inner object's area: ${innerObj.area}")

}
