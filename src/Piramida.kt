package Basic

class Piramida : Bentuk() {
    override fun tampilkan(ukuran: Int) {
        for (x in 0..ukuran) {
            for (y in 0..ukuran - x) {
                print(" ")
            }
            for (y in 0..2 * x) {
                print("*")
            }
            println(" ")
        }
    }
}