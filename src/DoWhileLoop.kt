fun main() {
    val array: Array<String> = arrayOf("Kotlin", "Java", "Python", "C++", "C#")

    var i: Int = 0
    do {
        print("Hello ")
        println(array[i])
        i++
    } while (
        i < array.size
    )

    // Range
    i = 1
    do {
        println(i)
        i++
    } while (
        i <= 5
    )

    // DownTo
    i = 100
    do {
        println(i)
        i -= 5
    } while (
        i >= 1
    )

    val ukuranArray: Int = array.size - 1
    i = 0
    do {
        println(array[i])
        i++
    } while (
        i <= ukuranArray
    )

}