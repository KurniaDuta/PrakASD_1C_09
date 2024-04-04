package P7;

import java.util.Scanner;

public class bukuMain09 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        pencarianBuku09 data = new pencarianBuku09();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\tPROGRAM PENCARIAN BUKU");
        
        buku09 buku = new buku09(111, "Algoritma", 2019, "Wahyuni", 5);
        buku09 buku1 = new buku09(123, "Big Data", 2020, "Susilo", 3);
        buku09 buku2 = new buku09(125, "Desain UI", 2021, "Supriadi", 3);
        buku09 buku3 = new buku09(126, "Web Programming", 2022, "Pustaka Adi", 2);
        buku09 buku4 = new buku09(127, "Etika Mahasiswa", 2023, "Darmawan Adi", 2);
        
        data.tambah(buku);
        data.tambah(buku1);
        data.tambah(buku2);
        data.tambah(buku3);
        data.tambah(buku4);

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", "Kode Buku", "JudulBuku", "Tahun Terbit",
                "Pengarang", "Stock");
        System.out.println("----------------------------------------------------------------------------");
        data.tampil();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Masukkan kode buku yang ingin dicari: ");
        System.out.print("Kode Buku: ");
        int kodeCari = s1.nextInt();
        System.out.println("Dengan Sequential Search");
        int posisi = data.FindSeqSearch(kodeCari);
        data.tampilPosisi(kodeCari, posisi);
        data.tampilData(kodeCari, posisi);

        s1.close();
    }
}
