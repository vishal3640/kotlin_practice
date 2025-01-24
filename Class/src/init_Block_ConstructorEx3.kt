

class Size3(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    init {
        width = if (_width >= 0) _width else {
            println("Error, the width should be a non-negative value")
            0
        }
        height = if (_height >= 0) _height else {
            println("Error, the height should be a non-negative value")
            0
        }
    }

    //we write multiple init{} blocks in class.

    init {
        println("Initializer block that prints the width ($width) and the height ($height)")
    }

}

fun main(args : Array<String>)
{
    var obj = Size3(12,-89)
    println("Width : ${obj.width} and Height : ${obj.height}")
}