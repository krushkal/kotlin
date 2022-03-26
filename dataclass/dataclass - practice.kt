
package dataclass
// Date: 25-11-21


/*class Bottle(val material: String, val Price: Int)

fun main() {
    val bottle1 = Bottle("Steel", 500)
    val bottle2 = Bottle("Aluminium", 400)
    val bottle3 = bottle1
    val bottle4 = Bottle("Steel", 500)
    val num = 23
    val num1 = 5.2
    val num2 = 2.5f
    val num3 = 25L
    val num4 : Byte = 1
    val num5 : Short = 12
    val chr = 'a'
    val str = "AnDa"

    println(bottle1.Price)
    println(bottle1.material)

    println(bottle1.toString())

    println(num.hashCode())
    println(num1.hashCode())
    println(num2.hashCode())
    println(num3.hashCode())
    println(num4.hashCode())
    println(num5.hashCode())
    println(chr.hashCode())
    println(str.hashCode())

    println(bottle1.hashCode())
    println(bottle2.hashCode())
    println(bottle3.hashCode())
    println(bottle4.hashCode())
    println(bottle1 == bottle3)
    println(bottle1 == bottle4)

}*//*


// primary constructor is must for data class
data class Bottle(var material: String, var Price: Int) {
    fun prnt() {
        println("i am inside data class")
    }
}

fun main() {
    var bottle1 = Bottle("Steel", 500)
    val bottle2 = Bottle("Aluminium", 400)
    val bottle3 = bottle1.copy() // copy is a special additional feature of data class which has not been inherited from Any class
    val bottle5 = bottle2.copy(material = "Aluminium") // val bottle5 = Bottle(brass, 300) and material = "xyz" this is the proper way
    val bottle4 = Bottle("steel", 500)  // Case sensitive
    val bottleX = Bottle("xyz", 42)
    val bottleY = Bottle("xyz", 42)

    val chunk1 = bottle1.Price
    val chunk2 = bottle1.material
    println(chunk1)
    println(chunk2)

    val chunk3 = bottle1.component1()
    val chunk4 = bottle2.component2()
    println(chunk3)
    println(chunk4)

    val (chunk5, chunk6) = Bottle("kfd", 5154)
    println(chunk5)
    println(chunk6)

    val (chunk7, chunk8) = bottle1
    println(chunk7)
    println(chunk8)

    bottle1 = Bottle("kdf", 544)
//    bottle1.component2() = 325  // gives warning : variable expected
//    bottle1.component1() = "jkdf"
    bottle1.Price = 325
    bottle1.material = "jkfdhjkh"

    println(bottle1.toString())
    println(bottle2.toString())
    println(bottle3.toString())
    println(bottle4.toString())
    println(bottle5.toString())

    println(bottle1.hashCode())
    println(bottle2.hashCode())
    println(bottle3.hashCode())
    println(bottle5.hashCode())
    println(bottle1 == bottle3)
    println(bottle1 == bottle4)
    println(bottle2 == bottle5)

    println(bottleX === bottleY)
    println(bottleX == bottleY)
    Bottle("dfkjh", 254).prnt()
}
*/
