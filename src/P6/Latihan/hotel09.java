package P6.Latihan;

public class hotel09 {
    String nama, kota;
    int harga;
    byte bintang;

    public hotel09(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    void tampil() {
        System.out.println("+--------------------------+");
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " +  harga);
        System.out.println("Bintang: " + bintang);
    }
}
