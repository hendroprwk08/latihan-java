package Koperasi;

import java.util.Scanner;

public class Karyawan {
    Scanner sc = new Scanner(System.in);
    String nik, nama;
    int pilih;
    
    void masukkan(){
        System.out.println("=== MASUKKAN DATA ===");
        System.out.println("=====================");
        System.out.print("NIK: ");
        this.nik = sc.nextLine();
        System.out.print("Nama: ");
        this.nama = sc.nextLine();
    }
    
    void golongan(){
        System.out.println("=== PILIH GOLONGAN ===");
        System.out.println("=====================");
        System.out.println("1. Golongan A");
        System.out.println("2. Golongan B");
        System.out.println("3. Golongan C");
        System.out.println("=====================");
        System.out.print(" Pilih: ");
        this.pilih = sc.nextInt();
    }
    
}
