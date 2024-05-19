fun main() {
    val array: Array<String> = arrayOf("Kotlin", "Java", "Scala", "Groovy")
    println(array[0])
    println(array.size)
    println(array.get(1))
    array.set(2, "Dart")
    println(array[2])

    array[3] = "Python"
    println(array[3])

    val balances : Array<Int> = arrayOf(50_000, 100_000, 200_000, 500_000, 1_000_000)

    println(balances[0])

    val nullArray: Array<String?> = arrayOfNulls(5)
    nullArray[0] = "Kotlin"
    nullArray[1] = "Java"
    nullArray[2] = "Scala"
    nullArray[3] = "Groovy"
    nullArray[4] = null
    println(nullArray[0])
    println(nullArray[1])
    println(nullArray[2])
    println(nullArray[3])
    println(nullArray[4])

}