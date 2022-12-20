package problems

class Parent {
    var num
        get() = 25

    var num1 = 56

}

fun main() {
    val parent = Parent()
}

/* VAL CASES
 *
 * In this case the type of the num is inferred whether it is val or var (In this case, initialization isn't required because compiler
 * hasn't generated the field for it or there isn't the field available for it. If the compiler had allowed this,
 * it would have been useless because we won't have been able to access the field because the get value will
 * override the field value ultimately).
 *   val num
 *       get() = 9
 * ---------------------------------------------------------------------------------------------------------------
 * Initializer isn't allowed here because this property has no backing field error (what i think it's because at
 * the end we won't get 59 if we try to access the value, 59 will be useless).
 *   val num = 59
 *       get() = 9
 *
 * But the following code fixes the error
 * (In this case we use the field identifier, the initialization is required that i think is because when we will
 * get the value we will ultimately access the underlying value so there must be something in the underlying value
 * to be accessed).
 *   val num = 25
         get() = 9 * field
 * ---------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------
 * VAR CASES
 *
 * Property must be initialized error
 *   var num
        get() = 25
 *
 *
 *
 *
 */