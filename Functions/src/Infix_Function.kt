

//without use infix

//fun main(args : Array<String>)
//{
//    val a : Int = 10
//    val b : Int = 25
//
//    var max = a.maxVal(b)
//    println("Max value : $max")
//}
//
//fun Int.maxVal(other : Int) : Int
//{
//    if(this > other)
//       return this
//    else
//        return other
//}

//using infix

fun main(args : Array<String>)
{
    val a : Int = 10
    val b : Int = 25

    var max = a maxVal b //here, not use bracket, because fun is infix
    println("Max value : $max")
}

infix fun Int.maxVal(other : Int) : Int
{
    if(this > other)
        return this
    else
        return other
}