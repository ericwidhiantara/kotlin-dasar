fun main() {
    val firstName: String = "Eric"
    val lastName: String = "Cartman"
    val fullName: String = "$firstName $lastName"
    val address : String = """
        123 South Park
        Colorado
        USA
    """
    val addressTrimIndent: String = """
        |123 South Park
        |Colorado
        |USA
    """.trimIndent()

    val addressTrimMargin: String = """
        >123 South Park
        >Colorado
        >USA
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)
    println(addressTrimIndent)
    println(addressTrimMargin)

}