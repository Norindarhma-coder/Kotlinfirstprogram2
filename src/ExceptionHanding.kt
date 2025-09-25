fun main(args: Array<String>) {
    try {
        val myVar: Int = 10
        val v: String = "12345"
        val angka = v.toInt()
        println("Hasil konversi: $angka")
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handling in Kotlin")
    }
}
