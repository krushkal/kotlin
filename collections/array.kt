package collections
// Date : 13-12-21

fun printArray(array: Array<Int?>) { //how can I make a function to accept two types of arguments
    for (i in array)
        println(i)
}
//what is the shortcut for knowing arguments of anything
fun arrayFeatures() {
    //val arr = arrayOf<Int?>(5,6) // or you can write this statement as : val arr : Array<Int?> = arrayOf(45,65)
    val arr = arrayOfNulls<Int>(5) //why doesn't it force me to put the type nullable Int.
    val array = arrayOfNulls<Int?>(5) //why doesn't it force me to put the type nullable Int.
    printArray(arr)
    printArray(array)


    val array1 : Array<Int> = arrayOf(2,6,0,1,7,4)
    println(array1.indexOf(7))
    println(array1.get(1))
    println(array1.size)
    println(array1.contains(7))
    println(array1.sum()) // doesn't work if the type is nullable even if it does not contain any null values
    println(array1.average()) // doesn't work if the type is nullable even if it does not contain any null values
    // val arra = arrayOf(15, 12 , null) // doesn't work with null but works with strings, chars and even booleans
    val arra = arrayOf(true, false)
    println(arra.minOrNull()) // min() or max doesn't work see the error
    println(arra.maxOrNull())
    array1.reverse()
    for(i in array1)
        print("$i ")
    println()
    array1.sort() //doesn't work with null values or even only the type is Int? but doesn't contain any null values
    for(i in array1)
        println(i)
    array1.set(2,50)
    for (i in array1)
        print("$i ")


    //val stringArray = arrayOf("a","ZEbra","zEbrA","book","cut","zEbra","zebRA","A","ZEBRA") // "a" how is this working. this is character, isn't it
    //val charArray = arrayOf('c','a','A','Z','b','C','z')
    val stringArray = arrayOf(true,false,false,true,false,false)
    //As far as knew, uppercase has topmost priority and in case of boolean false has the topmost priority: see the result
    stringArray.sort()
    for (i in stringArray)
        println(i)

    // trying to use plus function
    val originalArray = arrayOf(20, 10, 56)
    val newArray = originalArray.plus(originalArray) // see arguments it takes such as array or single element
    for (i in newArray)
        print("$i ")
}
fun main() {
    arrayFeatures()
}
/*val array123: Array<Int?> = arrayOf(1,3)
 val array12 : Array<Array<Int?>> = arrayOf(array123)*/
