

    fun main()
    {
    //    var name: String? = null
    //    val length: Int = name?.length ?: throw NullPointerException()
    //    print(length)

        // ------------------
        //this output is same. here use Assertion operator
        var name: String? = null
        print(name!!.length)
    }