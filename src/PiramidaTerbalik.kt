package Basic

class PiramidaTerbalik : Bentuk() {
    override fun tampilkan(ukuran: Int) {
        for(x in ukuran downTo 0 ){
            for (z in 0 .. ukuran-x){
                print(" ")
            }
            for (z in 0 .. 2*x){
                print("*")
            }
            println(" ")
        }
    }
}