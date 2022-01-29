package Koperasi;

import java.util.Scanner;

public class MainKoperasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilih, lama;
        
        System.out.println("-- Pilih Status --");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Honorer");
        System.out.print("Pilih: ");
        pilih = sc.nextInt();
        
        //panggil class
        KaryawanTetap kt = new KaryawanTetap();
        KaryawanHonorer kh = new KaryawanHonorer();
        
        if( pilih == 1 ){
            kt.masukkan();
            kt.golongan();
        }else{
            kh.masukkan();
            kh.golongan();
        }
        
        System.out.print("Lama pinjam (bulan): ");
        lama = sc.nextInt();
        
        if( pilih == 1 ){
            kt.pinjam(lama);
        }else{
            kh.pinjam(lama);
        }
    }
}
