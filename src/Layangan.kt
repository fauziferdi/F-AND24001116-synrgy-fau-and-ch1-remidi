package Basic

class Layangan : Bentuk() {
    override fun tampilkan(ukuran: Int) {
        for(x in 0..ukuran ){
            for (y in 0 .. ukuran-x){
                print(" ")
            }
            for (y in 0 .. 2*x){
                print("*")
            }
            println(" ")
        }
        for(x in ukuran-1 downTo 0 ){
            for (y in 0 .. ukuran-x){
                print(" ")
            }
            for (y in 0 .. 2*x){
                print("*")
            }
            println(" ")
        }
    }
}