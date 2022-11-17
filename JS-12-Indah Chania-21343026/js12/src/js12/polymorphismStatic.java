
package js12;

/**
 *
 * @author Indah Chania 21343206
 */
public class polymorphismStatic {
    public static void main(String[] args){
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4\nKeliling Persegi adalah: "
        + CompileTime.keliling(a : 4) +"\n");
        //memanggil metode perimeter dengan dua argumen
        System.out.println(
        "Sisi Persegi Panjang adalah : 10, 13\nKeliling Persegi Panjang adalah: "
        +CompileTime.keliling(l : 10, b : 13));
    }
}
