package Basic

class Bintang : Bentuk() {
    override fun tampilkan(ukuran: Int) {
        for(y in 0 .. ukuran){
            for(z in 0 .. ukuran){
                if( y==z){
                    print("x")
                }else if(z == ukuran-y){
                    print("x")
                }else{
                    print(" ")
                }
            }
            println("")
        }
    }
}
