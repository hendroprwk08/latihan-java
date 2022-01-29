package latihan;

import java.text.NumberFormat;
import java.util.Locale;

public class Status extends Penyewaan {
    String nama;
    int jenis, ukuran, dekor;

    @Override
    void cetakData(String nama) {
        System.out.println("=============================");
        System.out.println("    D A T A  P E M E S A N ");
        System.out.println("=============================");
        System.out.println("Nama Pemesan: "+ nama );
        System.out.println("Jenis: "+ this.jenis );
        System.out.println("Ukuran: "+ this.ukuran );
        System.out.println("Dekor: "+ this.dekor );
        System.out.println("=============================");
        cetakTotal();
    }

    @Override
    void jenis(int j) {
        this.jenis = j;
    }

    //membuat method sendiri u/ mengolah jenis
    String getJenis(int jenis){
        String j = "";
        
        if(jenis == 1 ) j = "Terpal";
        
        if(jenis == 2 ) j = "Umum";
        
        if(jenis == 3 ) j = "Pernikahan";
        
        return j;
    }
    
    //olah ukuran
    String getDekor(int dekor){
        String d = "";
        
        if(dekor == 1 ) d = "Bronze";
        
        if(dekor == 2 ) d = "Silver";
        
        if(dekor == 3 ) d = "Gold";
        
        return d;
    }
    
    @Override
    void ukuran(int u) {
        this.ukuran = u;
    }

    @Override
    void dekor(int d) {
        this.dekor = d;
    }

    @Override
    void cetakTotal() {
        int byJenis = 0, byUkuran = 0, byDekor = 0, total = 0;
                
        if(jenis == 1 ) byJenis = 900000;
        
        if(jenis == 2 ) byJenis = 2000000;
        
        if(jenis == 3 ) byJenis = 3500000;
        
        
        if(ukuran == 1 ) byUkuran = 1200000;
        
        if(ukuran == 2 ) byUkuran = 3300000;
        
        if(ukuran == 3 ) byUkuran = 3500000;
        
        
        if(dekor == 1 ) byDekor = 1200000;
        
        if(dekor == 2 ) byDekor = 3300000;
        
        if(dekor == 3 ) byDekor = 3500000;
        
        total = byJenis + byUkuran + byDekor;
        System.out.println("Total biaya: "+ NumberFormat.getCurrencyInstance( new Locale("id", "ID")).format( total) );
    }
    
}
