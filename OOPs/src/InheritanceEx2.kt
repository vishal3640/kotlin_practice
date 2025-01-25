//Inheritance and constructors


open class Base(val beta: Int, val gamma: Int, var message: String = "") {
    init {
        println("Base initialized: beta=$beta, gamma=$gamma, message=$message \n")
    }

    constructor(beta: Int, message: String = "") : this(beta, 0, message)
}

class Derived(val alpha: Int, beta: Int, gamma: Int, message: String = "") : Base(beta, gamma, message) {
    init {
        println("Derived initialized: alpha=$alpha, beta=$beta, gamma=$gamma, message=$message \n")
    }

    constructor(alpha: Int, beta: Int, message: String = "") : this(alpha, beta, 0, message)
}

fun main() {
    Base(10)
    Base(10, 20)
    Base(10, 20, "My message")
    Base(10, "My message")

    Derived(0, 10)
    Derived(0, 10, 20)
    Derived(0, 10, 20, "My message")
    Derived(0, 10, "My message")
}
