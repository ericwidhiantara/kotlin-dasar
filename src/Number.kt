fun main() {
    val age: Byte = 26;
    val height: Int = 163;
    val distance: Short = 2000;
    val balance: Long = 10000000000000000L

    // Floating numbers
    val sampleFloat: Float = 10.10F
    val sampleDouble: Double = 9.78

    // Literals
    val decimalLiteral: Int = 100
    val hexLiteral: Int = 0xFF
    val binaryLiteral: Int = 0b0001

    // Underscore in number
    val ageUnderscore: Int = 3_0
    val heightUnderscore: Int = 1_6_3
    val distanceUnderscore: Int = 2_0_0_0
    val balanceUnderscore: Long = 1_000_000_000_000_000_0L

    // Conversions
    val ageInt: Int = 26
    val ageShort : Short = ageInt.toShort()
    val ageByte: Byte = ageInt.toByte()
    val ageLong: Long = ageInt.toLong()
    val ageFloat: Float = ageInt.toFloat()
    val ageDouble: Double = ageInt.toDouble()


    println("age $age")
    println("height $height")
    println("distance $distance")
    println("balance $balance")
    println("sample float $sampleFloat")
    println("sample double $sampleDouble")
    println("decimal literal $decimalLiteral")
    println("hex literal $hexLiteral")
    println("binary literal $binaryLiteral")
    println("age with underscore $ageUnderscore")
    println("height with underscore $heightUnderscore")
    println("distance with underscore $distanceUnderscore")
    println("balance with underscore $balanceUnderscore")
    println("age short $ageShort")
    println("age byte $ageByte")
    println("age long $ageLong")
    println("age float $ageFloat")
    println("age double $ageDouble")



}