package Basic

class PiramidaHollow : Bentuk() {
    val color = "\u001b[31m"
    val reset = "\u001b[0m"
    override fun tampilkan(ukuran: Int) {

        for (x in 1..<ukuran - 1) {
            for (y in x..<ukuran - 1) {
                print("  ")
            }
            for (z in 0..<2 * x - 1) {
                if (z == 0 || z == 2 * x - 2) {
                    print(color + " *" + reset)
                } else {
                    print("  ")
                }
            }
            println()
        }
        for (y in 1..<2 * ukuran - 1) {
            if (y % 2 == 1) {
                print(color + " *" + reset)
            } else {
                print("  ")
            }
        }
        println("")
    }
}

