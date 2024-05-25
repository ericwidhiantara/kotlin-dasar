fun main() {
    stringFunction("Hello other function from main function")
    integerFunction(100)
    booleanFunction(true)
    nullFunction("Luck", null)
    nullFunction("Jhon", "Doe")
}

fun stringFunction(value: String){
    println("ini datanya $value")
}

fun integerFunction(value: Int){
    println("ini datanya $value")
}

fun booleanFunction(value: Boolean){
    println("ini datanya $value")
}

fun nullFunction(firstName: String, lastName: String?){
    if(lastName != null){
        println("Name : $firstName $lastName")
    }
    else{
        println("Name : $firstName")
    }
}