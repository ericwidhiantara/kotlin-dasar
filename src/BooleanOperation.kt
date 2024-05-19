fun main() {
    // Boolean Operation
    val a: Boolean = true
    val b: Boolean = false

    println(a && b)
    println(a || b)
    println(!a)
    println(!b)
    println(a xor b)
    println(a xor a)
    println(b xor b)
    println(b xor a)
    println(a and b)
    println(a or b)
    println(a.not())
    println(b.not())
    println(a xor b)
    println(a xor a)
    println(b xor b)
    println(b xor a)
    println(a.and(b))
    println(a.or(b))


    val finalExam: Int = 75
    val attendance: Int = 80

    val passFinalExam: Boolean = finalExam > 70
    val passAttendance: Boolean = attendance > 75

    val pass: Boolean = passFinalExam && passAttendance
}