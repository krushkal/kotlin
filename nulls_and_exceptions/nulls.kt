package nulls_and_exceptions
//Date : 23-11-21

/*fun main() {
    var num = null
    println(num)
}*/

class Book{
    var num : Int? = 50
    fun countPage() {
        println("No. of pages is: 500")
    }
}


fun main() {
    var book1 : Book? = Book()
    println(book1?.num)
    book1?.countPage()
    book1 = null
    println(book1?.num)
    book1?.countPage()
    book1 = Book()

    val book2 = Book()
    // book2.num = book1?.52 can't do this so sad na
    println(book2.num)
    book2.num = book1.num
    //or
    book2.num = book1.num
    //or
    book2.num = book1.num
    println(book2.num)

    //Practicing Let
    book2.num = 325
    book2.let { println(it.num)  // see the suggested parameters
        book1.num  // what is this ^let suggestion or whatever it is ??
    }
}

