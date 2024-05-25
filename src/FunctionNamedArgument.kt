fun main() {
    sayMyName(firstName = "Jhon")
    sayMyName(firstName = "Jhon", middleName= "Ukhs", lastName = "Doe")
    sayMyName(firstName = "Jhon", lastName = "Doe")
    sayMyName("Jhon", "Doe", "Ukhs")
}

fun sayMyName(firstName: String,middleName:String? =null, lastName: String? = null){
    if(middleName != null && lastName != null){
        println("Name : $firstName $middleName $lastName")
    }
    else if(middleName != null){
        println("Name : $firstName $middleName")
    }
    else if(lastName != null){
        println("Name : $firstName $lastName")
    }
    else{
        println("Name : $firstName")
    }

}