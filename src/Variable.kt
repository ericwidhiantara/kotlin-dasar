// Constants
const val APP_NAME: String = "Kotlin"
const val APP_VERSION: String = "0.0.1"


fun main() {
    var name = "Kotlin"
    val age = 26
    println(name)
    name = "Java"
    println(name)
    println(age)

    var lastName: String? = "Kotlin"
    lastName = null

    println(lastName?.length)
    lastName = "Java"
    println(lastName)
    println(lastName.length)

    println("This is $APP_NAME version $APP_VERSION")

}