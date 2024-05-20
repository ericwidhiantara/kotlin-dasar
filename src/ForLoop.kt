fun main() {
    val array: Array<String> = arrayOf("Kotlin", "Java", "Python", "C++", "C#")

    for (element in array) {
        println(element)
    }

    // Range
    for (i in 1..5) {
        println(i)
    }

    // DownTo
    for (i in 100 downTo 1 step 5) {
        println(i)
    }


    val ukuranArray: Int = array.size-1
    for (i in 0..ukuranArray) {
        println(array[i])
    }

}