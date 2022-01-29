package IuranWarga;

public class Warga {
    String nik, nama, pekerjaan, status;
    long jumlah;

    public Warga() {
    }
    
    public Warga(String nik, String nama, String pekerjaan, String status, long jumlah) {
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.status = status;
        this.jumlah = jumlah;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getStatus() {
        return status;
    }

    public long getJumlah() {
        return jumlah;
    }
}
