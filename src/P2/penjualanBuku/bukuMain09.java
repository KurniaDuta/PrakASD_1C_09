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

        // buku09 bk2 = new buku09();
        // bk2.judul = "How to Train Your Dragons";
        // bk2.pengarang = "Cressida Cowell";
        // bk2.halaman = 432;
        // bk2.stok = 0;
        // bk2.harga = 275000;

        // bk2.terjual(4);
        // bk2.tampilInformasi();

        buku09 bk2 = new buku09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku09 bkDuta = new buku09("How to Cook Egg", "Duta Kurnia Ardhani", 200, 40, 80000);
        bkDuta.tampilInformasi();
    }
}
