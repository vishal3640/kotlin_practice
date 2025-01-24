const val AS_CD : String = "Shubham"

fun main() {
    println("main() started")
    count(1, 10)
    println("main() complete")

    //---------------------
    println("Constant value : $AS_CD")
}

fun count(start: Int, to: Int) {
    println("count() started")
    var start = start
    while (start < to) {
        println(start)
        start++
    }
    println("count() complete")
}