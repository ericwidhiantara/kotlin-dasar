fun main() {
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in 1..value) {
            result *= i
        }
        return result
    }

    fun factorialRecursiveIf(value: Int): Int {
        return if (value == 1) {
            value
        } else {
            value * factorialRecursiveIf(value - 1)
        }
    }

    fun factorialRecursiveWhen(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursiveWhen(value - 1)
        }
    }

    val resultLoop = factorialLoop(10)
    println(resultLoop)

    val resultRecursive = factorialRecursiveIf(10)
    println(resultRecursive)

    val resultRecursiveWhen = factorialRecursiveWhen(10)

    println(resultRecursiveWhen)


}