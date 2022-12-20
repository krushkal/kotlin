package inheritance

open class Parent(open val num: Int) {

    fun printMethod() {
        println("printing Parent.num()")
    }
}

class Child : Parent(32) {
    override var num = 25
        get() {
            return field * 3
        }
        set(value) {
            field = value - 1
        }
}

fun main() {
    val obj = Parent(100)
    println(obj.num)
    obj.printMethod()

    val obj1 = Child()
    println(obj1.num)
    obj1.num = 22
    println(obj1.num)
}

