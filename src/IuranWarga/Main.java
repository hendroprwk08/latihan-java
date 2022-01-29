package IuranWarga;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Pendataan {
   
     public static void main(String[] args) {
        ArrayList<Warga> w = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int pilih, lama;

        do{
            System.out.println("-----------------");
            System.out.println(" PEMBAYARAN IURAN");
            System.out.println("-----------------");
            System.out.println("1. Bayar");
            System.out.println("2. Rekap");
            System.out.println("3. Exit");
            System.out.println("-----------------");
            System.out.print("Pilihanmu: ");
            pilih = sc.nextInt();
            
            if ( pilih == 1 ){
                w = transaksi( w );
            }else if( pilih == 2 ){
                rekap(w);
            }
        } while ( pilih != 3 );
        
        w.clear();
    }
}
