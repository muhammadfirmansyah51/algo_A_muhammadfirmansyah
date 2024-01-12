import java.util.Scanner;

public class Tahun_Kabisat {

public static void main(String[] args) {

    int i = 0;
    
    System.out.println("Program Cek Tahun kabisat");
    System.out.println("=========================");
    System.out.print("Masukan jumlah Tahun : ");

    Scanner input = new Scanner(System.in);
    int jumlahtahun = input.nextInt();

    System.out.print("Masukan tahun -1 : ");
    Scanner scanner = new Scanner(System.in);
    int tahun = input.nextInt();

    System.out.print("Masukan Tahun -2 : ");
    Scanner scanner2 = new Scanner(System.in);
    int Tahun = input.nextInt();

    
    if (jumlahtahun % 400 == 0) {
        System.out.println("Tahun Kabisat");
    } else if (tahun % 100 == 0){
        System.out.println("Bukan Tahun Kabisat");
    } else if (Tahun % 4 == 0){
        System.out.println("Tahun Kabisat");
    } else {
        System.out.println("Bukan Tahun Kabisat");
    }

   }
}