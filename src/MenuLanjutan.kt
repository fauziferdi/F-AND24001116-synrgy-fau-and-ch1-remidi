package Basic
class MenuLanjutan {
    private var bentuk: Bentuk? = null

    fun menuLanjutanAplikasi(pilihan: Int) {
        when (pilihan) {
            1 -> handlePiramida()
            2 -> handlePiramidaTerbalik()
            3 -> handleLayangan()
            4 -> handleBintang()
            5 -> handlePiramidaHollow()
            else -> println("Pilihan tidak valid.")
        }
    }

    // Fungsi-fungsi untuk menangani pilihan pengguna
    private fun handlePiramida() {
        val piramida = Piramida()
        handleBentuk(piramida)
    }

    private fun handlePiramidaTerbalik() {
        val piramidaTerbalik = PiramidaTerbalik()
        handleBentuk(piramidaTerbalik)
    }

    private fun handleLayangan() {
        val layangan = Layangan()
        handleBentuk(layangan)
    }

    private fun handleBintang() {
        val bintang = Bintang()
        handleBentuk(bintang)
    }

    private fun handlePiramidaHollow() {
        val piramidaHollow = PiramidaHollow()
        handleBentuk(piramidaHollow)
    }


    private fun handleBentuk(bentuk: Bentuk) {
        while (true) {
            menu()
            val input = readLine()?.toIntOrNull() ?: 0
            when (input) {
                1 -> {
                    println("Hasil Gambar:\n")
                    bentuk.tampilkan(7)
                }
                2 -> {
                    print("Masukkan ukurannya: ")
                    val ukuran = readLine()?.toIntOrNull() ?: 0
                    println("Hasil Gambar:\n")
                    bentuk.tampilkan(ukuran)
                }
                3 -> return
                else -> println("Menu tidak valid.")
            }
        }
    }

    private fun menu(){
        println("")
        println("""
        ======== Pilih Opsi Lanjutan ========
        =  1. Bentuk Default                =
        =  2. Input data                    =
        =  3. Kembali                       =
        =====================================
    """.trimIndent())
        print("Masukan Pilihan : ")
    }
}