fun main() {
    val result = finalValue("Erald", 10, 20, 30, 40, 50)
    println(result)


}

fun finalValue(name:String, vararg values:Int){
    var total = 0
    for(value in values){
        total += value
    }

   println("Final value of $name is $total")
}