import java.util.Scanner;
 
public class MenghitungDiameterBola {

    public static void main(String[] args) {
        //Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        //Meminta pengguna memasukan panjang jari jari bola
        System.out.print("Masukkan panjang jari jari bola (dalam satuan meter): ");
        double jarijari = scanner.nextDouble();

        //Memanggil fungsi untuk menghitung volume bola
        double volume = hitungvolumebola(jarijari);

        //menampilkan hasil 
        System.out.println("Volume bola adalah: " + volume  + " meter kubik.");
    }

    // Fungsi untuk menghitung volume bola berdasarkan jari jari
    public static double hitungvolumebola(double jarijari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jarijari, 3);
    }
}
