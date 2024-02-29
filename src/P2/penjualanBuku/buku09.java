package P2.penjualanBuku;

public class buku09 {
    String judul, pengarang;
    int halaman, stok, harga;

    public buku09() {
        
    }

    public buku09(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        if (stok == 0) {
            System.out.println("Stock Kurang!");
        }
        System.out.println("Harga: Rp " + harga);

    }

    void terjual(int jml) {
        if (stok > 0) {
           stok -= jml; 
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal (int jml) {
        return harga * jml;
    }

    double hitungDiskon (int hrg) {
        if (hrg > 150000) {
            return 0.12;
        } else if (hrg >= 75000 && hrg <= 150000) {
            return 0.05;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int hrg, double diskon) {
        return (int) (hrg - (hrg * diskon));
    }
}
