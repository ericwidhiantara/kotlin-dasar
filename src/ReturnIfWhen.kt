fun main() {
    fun sayHello(name: String): String {
        return if (name == "") {
            "Hello brader"
        } else {
            "Hi $name"
        }
    }

    fun sayHi(name: String): String {
        return when (name) {
            "" -> "Hello brader"
            else -> "Hi $name"
        }
    }


    val result = sayHello("Erald")
    println(result)
    val result2 = sayHello("")
    println(result2)

    val result3 = sayHi("Erald")
    println(result3)
    val result4 = sayHi("")
    println(result4)
    

}
