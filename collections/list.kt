package collections
// Date : 10-12-21

/*fun list() { // we can create list and mutable list without any element
    val list = listOf<Int>(50, 1, 2, 3, 548)
    println(list[1])
    println(list.get(2)) // gives weak warning that "should be replaced with indexing operator ( [] )
    println(list.indexOf(8)) //when I give any value which list doesn't contain then it prints -1 in every case.
    println(list.contains(548))
    println(list.size)
    println(list.reversed()) // alternatively, asReversed can be used
    println(list.sorted())
    println(list.sum())
    println(list.average())
    println(list.minOrNull())
    println(list.maxOrNull())
  //  println(max(1,9))
    println(list) // it does not work with arrays
}

fun mutableList() {
    val mutableList = mutableListOf<String>("hello", "what", "are", "you", "doing?")
    mutableList.set(2, "is") //gives the weak warning "should be replaced with indexing operator"
    println(mutableList)
    mutableList.add("listen")
    println(mutableList)
    mutableList.add(3,"bich me")
    mutableList.remove("ka") //we have to give element, and it doesn't give warning or error or nothing happens even if the value is invalid
    mutableList.remove("you")
    println(mutableList)
    mutableList.removeAt(3)  //we have to give index
    // mutableList.removeAt(5)  // it does throw an IndexOutOfBounds Exception
    println(mutableList)

    val mutableList1 = mutableListOf<Int>(1,2,5,89,54,2,3,7)
    println(mutableList1.toList())// saves a copy of mutableList1 into a list but here we are just printing the new list
    println(mutableList1.toMutableList()) // saves a copy of mutableList1 into a mutableList but here we are just printing the new list
    //  mutableList1.shuffle() //or use shuffled to combine both statements
    println(mutableList1.shuffled())
    val toAdd = mutableListOf(67,8,25)
    mutableList1.addAll(2,toAdd) // can be used with or without the index
    println(mutableList1)
    val toRemove = mutableListOf(2,5)
    mutableList1.removeAll(toRemove)
    println(mutableList1)
    val toRetain = mutableListOf(89,54)
    mutableList1.retainAll(toRetain)
    println(mutableList1)
    println(mutableList1.asReversed()) // or reversed ( used for iterable???????) alternatively, reverse() can be used or reverse
    println(mutableList1.sorted()) // or sort both work
    println(mutableList1.sum())
    println(mutableList1.average())
    println(mutableList1.minOrNull())
    println(mutableList1.maxOrNull())
    mutableList1.clear()
    println(mutableList1)
    println(mutableList1.size)
}*/

class Hash {
    val str = "are"
    val str1 = "what"
}

fun main() {
    //list()
   // mutableList()
/*   var str = "what"
   var str1 = "what"
   var str2: String = str1
    println("${str.hashCode()}\n" +
            "${str1.hashCode()}\n" +
            "${str2.hashCode()}")
   println(str==str1)
   println(str1===str2)
   println(str==str2)*/

    val obj = Hash()
    val obj1 = Hash()

    println(obj.hashCode())
    println(obj1.hashCode())
    println(obj==obj1)
    println(obj===obj1)
}