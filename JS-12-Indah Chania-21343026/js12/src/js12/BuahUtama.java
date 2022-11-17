
package js12;

/**
 *
 * @author Indah Chania 21343026
 */
public class BuahUtama {
    public static void main(String[]args){
        //Menggunakan constructor untuk menginstallasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp.3000","Merah");
        //Menggunakan getter nilai
        System.out.println("Nama Buah "+Apel.getName()+"\nHarga:"
        +Apel.getPrice()+"\nWarna: "+Apel.getColor());
        //update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println(x: "\nInformasi terkait Apel setelah di Update");
        //Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: "+Apel.getName()+"\nHarga: "
        +Apel.getPrice()+"\nWarna: "+Apel.getColor());
    }
}
