fun main() {

    val name = "Erald" to "UP"
    println(name)

    val name2 = "ERALD" to "LOW"
    println(name2)

}

infix fun String.to(type: String): String{
    if(type == "UP"){
        return this.uppercase()
    }else{
        return this.lowercase()
    }
}