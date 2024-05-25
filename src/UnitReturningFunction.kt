fun main() {
    printHello("Erald")

}

fun printHello(name: String? = null): Unit {
    if(name == null){
        println("Hello from function")
        return
    }
    println("Hello $name from function")
}