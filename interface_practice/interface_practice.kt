package interface_practice
// Date: 25-11-21

/*

abstract class CmPtr(val num : Int) {
    abstract val brand: String
    abstract val arChTr: String
    abstract val dobInYrs: Int
    fun get() {
        println(
            "brand: $brand\n" +
                    "Architecture: $arChTr\n" +
                    "Date-of-Birth: $dobInYrs"
        )
    }
    abstract fun existenceDetail() : Int
}

class CmPtr1(num : Int): CmPtr(num) {
    override val brand = "Crawl-E"
    override val arChTr = "x00"
    override val dobInYrs = 1965
    val isOperating = true

    override fun existenceDetail() : Int =
        if (isOperating) {
            println("it isn't in the existence anymore")
            num
        } else {
            println("i don't know")
            num
        }
}

abstract class CmPtr(val num : Int) {
    abstract val brand: String
    abstract val arChTr: String
    abstract val dobInYrs: Int
    fun get() {
        println(
            "brand: $brand\n" +
                    "Architecture: $arChTr\n" +
                    "Date-of-Birth: $dobInYrs"
        )
    }

    abstract fun existenceDetail(): Int
}

//discuss : does constructor run for abstract class ??
//Can we override properties in the abstract class ??
//This "println(548)" works
// - constructor parameter is not used as property (see warning)
abstract class CmPtr1(val a: Int) : CmPtr(a) {
    override val brand = "Intel"
    override val arChTr = "x86"
    override val dobInYrs = 1992
    abstract val isOperating : Boolean

    fun prt() {
        println(a)
    }

}

class CmPtr2(val num3: Int): CmPtr1(num3) {
    override val brand = "Crawl-E"
    override val arChTr = "x00"
    override val dobInYrs = 1965
    override val isOperating = true

    override fun existenceDetail(): Int =
        if (isOperating) { // check in the book
            println("it isn't in the existence anymore")
            num3
        } else {
            println("i don't know")
            num3
        }
}

*/

/*
open class A(open val num : Int) {
    fun prt() {
        println(num)
    }
}

class B(override val num: Int) : A(num) {
    fun prnt() {
        println("second $num")
    }

}
*/

open class A(val num : Int) {
    fun prt() {
        println(num)
    }
}

class B(val num1: Int) : A(num1) {
    fun prnt() {
        println("second $num1")
    }

}
