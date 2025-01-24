// Primary constructor initializes an instance of a class and its properties.

/*
class Size2(width: Int, height: Int) {
val width: Int = width
val height: Int = height
val area: Int = width * height
}
// ------------- OR -----------------------------------
// You can also use the constructor keyword explicitly:
// class Size2 constructor(width: Int, height: Int)

// ---------------------- OR --------------------
// Direct property initialization:
class Size2(val width: Int, val height: Int) {
val area: Int = width * height
}

fun main(args: Array<String>) {
var obj = Size2(12, 23)
println("Width : ${obj.width} , Height : ${obj.height} and Area : ${obj.area}")
}
*/

//------------------------------------------------
//default argument

class Size(var width: Int = 1, var height: Int = 1) {
    var area: Int = width * height
}

fun main() {
    val size0 = Size()
    val size1 = Size(3, 5) // width == 3, height == 5
    val size2 = Size(width = 3, height = 5) // width == 3, height == 5
    val size3 = Size(height = 5, width = 3) // width == 3, height == 5

    val size4 = Size(10) // width == 10, height == 1
    val size5 = Size(height = 10) // width == 1, height == 10

    println("${size0.area} , ${size1.area} , ${size2.area} , ${size3.area} , ${size4.area} , ${size5.area}")
}


//-------------------------------------