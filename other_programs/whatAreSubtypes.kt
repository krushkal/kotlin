package other_programs

/*
open class A {
   open val num : Int = 5 //signed or unsigned

    fun prnt() {
        println(num)
    }
}

class Inheriting : A() {
    override val num : Short = 5

}*/

open class A {
    open val num : Number = 45512 //signed

    fun prnt() {
        println(num)
    }
}

class Inheriting : A() {
    override val num : Int = 45
}