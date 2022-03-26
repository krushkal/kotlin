package other_programs

// Date : 06-01-22
// Program to change morse code to text
fun main() {
    val morse = mapOf(
        ".-" to 'A', //.-
        ".-.-" to 'B', //.-..
        "-..-" to 'S' //.--
    )
    val arr : Array<String> = Array(5) {"hi"}
    /*  val value = ".- .-.. .-.. .- .--"
      var num = 0
      for (i in value) {
          if (i != ' ')
              num = i.code + num * 100

          if (i == ' ') {
              print(morse[num])
              num = 0
          }
      }
      print(morse[num])*/
    var i = 0
    while (i < 5)
    {
        println(morse[readLine()])
      i++
    }
}