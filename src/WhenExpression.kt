fun main() {
    val nilai: Char = 'C'
    when(nilai){
        'A' -> println("Amazing")
        'B' -> println("Good Job!")
        'C' -> {
            println("Not Bad")
            println("But you can be better")
        }
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups, Wrong Input")
    }

    val finalExam: Char = 'A'

    when(finalExam){
        'A', 'B', 'C' -> {
            println("You Pass The Test")
            println("Good Job!")
        }
        'D', 'E' -> println("You Need To Retake The Test")
        else -> println("Ups, Wrong Input")

    }

    val examResult: String = "A"
    val arrayResult: Array<String> = arrayOf("A", "B", "C")
    when(examResult){
        in arrayResult -> println("You Pass The Test")
        !in arrayResult -> println("You Need To Retake The Test")
        else -> println("Ups, Wrong Input")
    }

    val name: String = "Kotlin"
    when(name){
        is String -> println("This is a String")
        !is String -> println("This is not a String")
        else -> println("Ups, Wrong Input")
    }

    val exam: Int = 80
    when{
        exam > 90 -> println("Amazing")
        exam > 80 -> println("Good Job!")
        exam > 70 -> println("Not Bad")
        exam > 60 -> println("Bad")
        else -> println("Try Again Next Year")
    }
}