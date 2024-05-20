fun main() {
    val array: Array<String> = arrayOf("Kotlin", "Java", "Python", "C++", "C#")
    var i: Int = 0
    while (i < array.size) {
        println(array[i])
        i++
    }
    // Range
    i = 1
    while (i <= 5) {
        println(i)
        i++
    }
    // DownTo
    i = 100
    while (i >= 1) {
        println(i)
        i -= 5
    }
    val ukuranArray: Int = array.size - 1
    i = 0
    while (i <= ukuranArray) {
        println(array[i])
        i++
    }
}