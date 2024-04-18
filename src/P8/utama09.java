package P8;

import java.util.Scanner;

public class utama09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Gudang");
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = input.nextInt();
        gudang09 gudang = new gudang09(kapasitas);

        while (true) {
            System.out.println(
                    "\nMenu:\n1. Tambah Barang\n2. Ambil Barang\n3. Tampilkan tumpukan barang\n4. Lihat barang teratas\n5. Lihat barang terbawah\n6. Cari Kode Barang\n7. Keluar");
            System.out.print("--> ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = input.nextLine();
                    barang09 barangBaru = new barang09(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang: ");
                    int kodeCari = input.nextInt();
                    input.nextLine();
                    gudang.cariBarang(kodeCari);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        }
    }
}
