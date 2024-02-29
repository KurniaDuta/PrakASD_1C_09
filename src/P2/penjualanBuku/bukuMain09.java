package P2.penjualanBuku;

public class bukuMain09 {
    public static void main(String[] args) {
        buku09 bk1 = new buku09();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println();
        buku09 bk2 = new buku09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println();
        buku09 bkDuta = new buku09("How to Cook Egg", "Duta Kurnia Ardhani", 200, 40, 80000);
        bkDuta.tampilInformasi();

        System.out.println("\nTotal bayar");
        bkDuta.terjual(3);
        bkDuta.tampilInformasi();
        System.out.println("Harga Total Buku: "+ bkDuta.hitungHargaTotal(3));
        System.out.println("Diskon: "+ bkDuta.hitungDiskon(bkDuta.hitungHargaTotal(3)));
        System.out.println("Total Bayar: " + bkDuta.hitungHargaBayar(bkDuta.hitungHargaTotal(3), bkDuta.hitungDiskon(bkDuta.hitungHargaTotal(3))));
    }
}
