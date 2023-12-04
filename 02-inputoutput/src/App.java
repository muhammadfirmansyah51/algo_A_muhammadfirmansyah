import java.util.Scanner;

 public class App {
 
    public static void main(String[] args) throws Exception {
        //Deklarasi Variabel dan Tipr Data
        String nama;
        int nim;
        String prodi;
        Double tinggi_badan;

        //membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("Form data mahasiswa UNDIKMA");
        System.out.println("=============================");
        //membuat Form
        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Masukan Prodi : ");
        prodi = input.nextLine();

        System.out.print("Masukan Nim : ");
        nim = input.nextInt();

        System.out.print("Tinggi Badan : ");
        tinggi_badan = input.nextDouble();

        //cetak output ke layar monitor
        System.out.println("Data Mahasiswa UNDIKMA");
        

        
    }
 }
    
        
       
        
        

        
        
        
        

         
        
        
        

        
    

 