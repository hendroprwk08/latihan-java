package Koperasi;

import java.text.NumberFormat;
import java.util.Locale;

public class KaryawanHonorer extends Karyawan {
    void pinjam(int bulan){
        String gol = "";
        int lama;
        double pinjam = 0;
        
        if(super.pilih == 1 ){
            gol = "A";
            pinjam = 30000000;
        }else if(super.pilih == 2 ){
            gol = "B";
            pinjam = 20000000;
        }else if(super.pilih == 3 ){
            gol = "C";
            pinjam = 10000000;
        }
        
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        
        System.out.println("Golongan Anda: "+ gol);
        System.out.println("Pinjaman: "+ nf.format( pinjam ));
        System.out.println("Bunga: "+ nf.format( pinjam * 0.025 ) );
        System.out.println("=============================");
        System.out.println("Kewajiban: "+ nf.format( ( pinjam + ( pinjam * 0.025 ) ) / bulan ) );
        System.out.println("Total pinjaman: "+ nf.format( pinjam + ( pinjam * 0.025 ) ) );
        System.out.println("**********  Terima Kasih  *********");
        
    }
}
