package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var namadepan: String = "Dewangga"
    var namabelakang: String = "Nanda Arjuna"
    var umur: Int = 20
    var single: Boolean = true

    println("Namaku " + namadepan + " " + namabelakang + "\nSaya Berumur " + umur + "\nSaya " + if (single) "Single" else "Tidak Single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String) {
    println("Kelompok : $groupId")
    println("Anggota: $groupMember")
    println("Sesi: $session")
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val myTeamList = listOf("Putra", "Novia", "Dewangga", "Sugini", "Abdul", "Alexandro", "Faiz", "Nabilah", "Revon", "Vina")
    return listOf(myTeamList)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Sasa", "Kak Kelvin", "Kak Iffan")
    val countOfGroup = arrayOf("Putra", "Novia", "Dewangga", "Sugini", "Abdul", "Alexandro", "Faiz", "Nabilah", "Revon", "Vina")
    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Kelompok Merge 13", listOf("Putra", "Novia", "Dewangga", "Sugini", "Abdul"), "Sesi Pagi")
}