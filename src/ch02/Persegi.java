public class Persegi {
    int sisi;
    int luas() {
        return sisi*sisi;
    }
}
PersegiPanjang
package ch02;
 
public class PersegiPanjang {
    int panjang;
    int lebar;
    int luas() {
        return panjang * lebar;
    }
}
Lingkaran
package ch02;
 
public class Lingkaran {
    double jariJari;
    double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
