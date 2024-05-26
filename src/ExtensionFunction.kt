fun main() {
    val name: String = "Erald"
    val hello: String = name.hello()

    println( hello)
    val hi: String = name.sayHi()
    println(hi)

    name.sayHello()


}

fun String.hello(): String = "Hello $this from extension function"

fun String.sayHi(): String = "Hi $this from extension function"

fun String.sayHello(): Unit = println("Hello $this from extension function")