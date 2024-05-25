fun main() {
    val result = otherFunction()
    println(result)
    val res = functionReturnString("Erald")
    println(res)

    val resInt = functionReturnInt(10)
    println(resInt)

    val sumResult = sum(10, 20)
    println(sumResult)

    val subtractResult = subtract(20, 10)
    println(subtractResult)

    val multiplyResult = multiply(10, 20)
    println(multiplyResult)

    val divideResult = divide(20, 2)
    println(divideResult)

}

fun functionReturnString(name:String? = null): String {
    return "Hello $name from function"
}

fun functionReturnInt(value: Int): Int {
    return value
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    if(b == 0) return 0
    return a / b
}