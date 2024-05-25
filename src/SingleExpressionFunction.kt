fun main() {
    val result = singleExpressionFunction("Erald")
    println(result)
    println(hi("Erald"))
    val res = hello("Erald")
    println(res)

    println(multiplySingle(10, 20))

}

fun singleExpressionFunction(name: String): String = "Hello $name from function"

fun hi(name: String): String = "Hi $name from function"

fun hello(name: String): Unit = println("Hello $name from function")

fun multiplySingle(a: Int, b: Int): Double = a.toDouble() * b.toDouble()