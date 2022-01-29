package latihan;

import java.util.Scanner;

public class Main {
    private static String nama;
    private static String telepon;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("     S E W A  T E N D A ");
        System.out.println("============================");
        System.out.println();
        
        System.out.println("Nama penyewa: "); 
        nama = input.nextLine();
        
        System.out.println("Telepon: "); 
        telepon = input.nextLine();
        
        System.out.println(" DATA JENIS TENDA"); 
        System.out.println("1. Tenda terpal - Rp 900.000"); 
        System.out.println("2. Tenda umum - Rp 2.000.000"); 
        System.out.println("3. Tenda pernikahan - Rp 3.500.000"); 
        System.out.println(); 
        System.out.println(" DATA UKURAN TENDA"); 
        System.out.println("1. S - Rp 1.200.000"); 
        System.out.println("2. M - Rp 3.300.000"); 
        System.out.println("3. XL - Rp 3.500.000"); 
        System.out.println();
        System.out.println(" DATA DEKOR TENDA"); 
        System.out.println("1. Bronze - Rp 1.200.000"); 
        System.out.println("2. Silver - Rp 3.300.000"); 
        System.out.println("3. Gold - Rp 3.500.000"); 
        System.out.println();
        
        Status s = new Status();
        
        int j, u, d;
        
        System.out.println("Jenis: ");
        j = input.nextInt();
        s.jenis(j);
        
        System.out.println("Ukuran: ");
        u = input.nextInt();
        s.ukuran(u);
        
        System.out.println("Dekor: ");
        d = input.nextInt();
        s.dekor(d);
        
        s.cetakData(nama);
    }
    
}
