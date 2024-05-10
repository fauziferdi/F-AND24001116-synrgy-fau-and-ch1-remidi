package Basic

fun main() {
    val menuLanjutan = MenuLanjutan()
    var input: Int

    while (true) {
        println()
        println("""
        ==== Selamat Datang di Aplikasi ====
        1. Bentuk Piramida Bintang
        2. Piramida Bintang Terbalik
        3. Layang-layang Bintang
        4. Bintang
        5. Piramida Hollow Bintang
        6. Keluar
        =============================
    """.trimIndent())
        print("Pilih pilihan : ")

        input = readLine()?.toIntOrNull() ?: 0
        if (input == 6) {
            println("Selamat tinggal")
            break
        }

        menuLanjutan.menuLanjutanAplikasi(input)
    }
}


