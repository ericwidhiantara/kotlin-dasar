fun main() {
    val nilai: Int = 75
    val absen: Int = 80

    val lulusNilai: Boolean = nilai > 70
    val lulusAbsen: Boolean = absen > 75

    if (lulusNilai && lulusAbsen) {
        println("Selamat, Anda lulus!")
    } else if (lulusNilai || lulusAbsen) {
        println("Anda harus mengulang ujian!")
    }else{
        println("Anda tidak lulus!")
    }
}