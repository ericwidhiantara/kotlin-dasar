fun main() {
    fun sayHello(name: String): String {
        return "Hello $name from function"
    }

    val result = sayHello("Erald")
    println(result)
    sayHi("Erald")


}

fun sayHi(name: String): String {
    helloWorld()
    //We can't call sayHello function because it is not in the same scope
    //sayHello(name)
    return "Hi $name from function"
}

fun helloWorld(): Unit {
    println("Hello World")
}