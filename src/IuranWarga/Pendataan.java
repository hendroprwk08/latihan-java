package IuranWarga;

import java.util.ArrayList;
import java.util.Scanner;

public class Pendataan {
    Scanner sc = new Scanner(System.in);
    private String 
            nama, 
            nik, 
            alamat,
            telepon,
            pekerjaan,
            status;
    long jumlah;
    
    public static ArrayList<Warga> transaksi(ArrayList<Warga> w) {
       Scanner sc = new Scanner( System.in ); 
       ArrayList<Warga> wargas = new ArrayList();
       wargas = w; //masukkan data penampung

       System.out.println("***** Data Warga *****");
       System.out.print("NIK: ");
       String nik = sc.nextLine();
       System.out.print("Nama: ");
       String nama = sc.nextLine();
       System.out.print("Alamat: ");
       String alamat = sc.nextLine();
       System.out.print("Telepon: ");
       String telepon = sc.nextLine();
       System.out.print("Pekerjaan: ");
       String pekerjaan = sc.nextLine();
       System.out.print("Status: ");
       String status = sc.nextLine();
       System.out.print("Jumlah: ");
       int jumlah = sc.nextInt();

       wargas.add( new Warga( nik, nama, pekerjaan, status, jumlah ) );

       return wargas;
   }
   
    public static void rekap(ArrayList<Warga> w) {    
        int total = 0;
        
        System.out.println("Jumlah Order: "+ String.valueOf(w.size() ) );
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("| %-5s| %-15s| %-13s| %-13s| %-13s| %-13s|", 
                "No", 
                "NIK", 
                "Nama", 
                "Pekerjaan", 
                "Status", 
                "Jumlah");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        
        int num = 1;
        for( int i = 0; i < w.size(); i++){

            System.out.printf("| %-5s| %-15s| %-13s| %-13s| %-13s| %-13s|", 
                num++, 
                w.get( i ).getNik(), 
                w.get( i ).getNama(), 
                w.get( i ).getPekerjaan(), 
                w.get( i ).getStatus(),
                w.get( i ).getJumlah());

            System.out.println();

            total += w.get( i ).getJumlah();
        }
        
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Total: "+ total);
    }
    
}

