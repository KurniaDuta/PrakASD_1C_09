package P8;

import java.util.Scanner;

public class utama09 {
    public static void main(String[] args) {
        gudang09 gudang = new gudang09(7);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:\n1. Tambah Barang\n2. Ambil Barang\n3. Tampilkan tumpukan barang\n4. Keluar");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        }
    }
}
