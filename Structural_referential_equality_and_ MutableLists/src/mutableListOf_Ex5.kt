
fun main()
{
    //copy list in another list
    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toMutableList()

    print(copyList) // [1, 2, 3, 4, 5]

    //--------------------------------
    val list1 = mutableListOf(1, 2, 3, 4, 5)
    val copyList1 = mutableListOf<Int>()
    copyList1.addAll(list1)

    print(copyList1) // [1, 2, 3, 4, 5]

}