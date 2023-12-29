import java.util.Scanner;

public class PercepatanDanKecepatan {

    public static void main(String[] args) {
        //Membuat objek scanner untuk membaca input dari pengguna 
        Scanner scanner = new Scanner(System.in);

        //Meminta pengguna memasukan nilai kecepatan awal (v0)
        System.out.print("Masukan nilai kecepatan awal (v0) dalam m/s: ");
        double kecepatanAwal = scanner.nextDouble();

        //Meminta pengguna memasukan nilai kecepatan akhir (v)
        System.out.print("masukan nilai kecepatan akhir (v) dalam m/s: ");
        double kecepatanAkhir = scanner.nextDouble();

        //Meminta pengguna memasukan waktu (t)
        System.out.print("Masukan nilai waktu (t) dalam detik: ");
        double waktu = scanner.nextDouble();

        //Memanggil fungsi untuk menghitung percepatan
        double percepatan = hitungpercepatan(kecepatanAwal, kecepatanAkhir, waktu);

        //Memanggil fungsi untuk menghitung kecepatan rata rata 
        double kecepatanRataRata = hitungkecepatanRataRata(kecepatanAwal, kecepatanAkhir);

        //Menampilkan hasil
        System.out.println("perecepatan adalah: " + percepatan + " m/s^2.");
        System.out.println("kecepatan rata-rata adalah: " + kecepatanRataRata + "m/s.");
    }

    //Fungsi untuk menghitung kecepatan
    public static double hitungpercepatan(double kecepatanAwal, double kecepatanAkhir, double waktu){
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }

    //Fungsi untuk menghitung kecepatan rata-rata
    public static double hitungkecepatanRataRata(double kecepatanAwal, double kecepatanAkhir) {
        return (kecepatanAwal + kecepatanAkhir) / 2;
    }
}
