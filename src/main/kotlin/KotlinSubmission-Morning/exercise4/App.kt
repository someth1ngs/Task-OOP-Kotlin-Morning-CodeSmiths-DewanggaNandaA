package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        val result = (10/0)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Error: Pembagian oleh nol tidak diizinkan.")
    }

    // Contoh 2: Menangani konversi string ke integer
    try {
        val number = "Test".toInt()
        println("Angka: $number")
    } catch (e: NumberFormatException) {
        println("Error: Konversi string ke integer gagal.")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
