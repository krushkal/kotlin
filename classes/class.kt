package classes

// Date: 03-10-21
// About: practicing class

// type 1
class Bat(private val length_in_meters: Int, private val wood_type: String, private val life_in_years: Byte ) {

    private val brand :String
    get() = "kookaburra".uppercase()

    fun describeBat() {
        println("here is your $wood_type bat of $length_in_meters metres made by $brand and will last for $life_in_years yrs.")
    }

    fun renderBat() {
        println("rendering is in the progress....")
        println("rendering done")
        println("here is your bat - BAT")
    }
}

fun main() {
    val bat = Bat(25,"english willow",5)
    bat.describeBat()
    bat.renderBat()
    println(bat.toString())
}

