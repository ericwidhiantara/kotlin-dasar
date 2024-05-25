fun main() {

    sayName("Jhon")
    sayName("Jhon", "Doe")
    sayFullName("Jhon")
    sayFullName("Jhon", "Doe")
}

fun sayName(firstName: String, lastName: String = ""){
    println("Name : $firstName $lastName")
}

fun sayFullName(firstName: String, lastName: String? = null){
    if(lastName != null){
        println("Name : $firstName $lastName")
    }
    else{
        println("Name : $firstName")
    }
}