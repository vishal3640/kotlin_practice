//Inheritance and secondary constructor with super keyword

open class Base1(val beta: Int, val gamma: Int = 0, var message: String = "") {
    init {
        println("Base initialized: beta=$beta, gamma=$gamma, message=$message")
    }
}

class Derived1 : Base1 {
    val alpha: Int

    constructor(alphaConstr: Int, beta: Int) : super(beta) {
        alpha = alphaConstr
        println("Derived initialized1 : alpha=$alpha, beta=$beta, gamma=$gamma, message=$message")
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int) : super(beta, gamma) {
        alpha = alphaConstr
        println("Derived initialized2 : alpha=$alpha, beta=$beta, gamma=$gamma, message=$message")
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int, message: String) : super(beta, gamma, message) {
        alpha = alphaConstr
        println("Derived initialized3 : alpha=$alpha, beta=$beta, gamma=$gamma, message=$message")
    }

    constructor(alphaConstr: Int, beta: Int, message: String) : super(beta, message = message) {
        alpha = alphaConstr
        println("Derived initialized4 : alpha=$alpha, beta=$beta, gamma=$gamma, message=$message")
    }
}

fun main() {
    Derived1(1, 10)
    Derived1(1, 10, 20)
    Derived1(1, 10, 20, "Message")
    Derived1(1, 10, "Message")
}
