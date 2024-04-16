package P7;

import java.util.Scanner;

public class bukuMain09 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        char back;
        String kodeCari;
        int posisi;

        pencarianBuku09 data = new pencarianBuku09();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\tPROGRAM PENCARIAN BUKU");

        buku09 buku = new buku09("20210", "Algoritma", 2019, "Wahyuni", 5);
        buku09 buku1 = new buku09("20211", "Big Data", 2020, "Susilo", 3);
        buku09 buku2 = new buku09("20212", "Desain UI", 2021, "Supriadi", 3);
        buku09 buku3 = new buku09("20214", "Web Programming", 2022, "Pustaka Adi", 2);
        buku09 buku4 = new buku09("20215", "Etika Mahasiswa", 2023, "Darmawan Adi", 2);
        buku09 buku5 = new buku09("20216", "Web Programming", 2023, "Darmawan Adi", 2);

        data.tambah(buku);
        data.tambah(buku1);
        data.tambah(buku2);
        data.tambah(buku3);
        data.tambah(buku4);
        data.tambah(buku5);

        do {
            System.out.println("\nFilter Pencarian Buku berdasarkan: \n1. Kode Buku\n2. Judul Buku\n3. Exit");
            System.out.print("--> ");
            char filter = s1.nextLine().charAt(0);

            switch (filter) {
                case '1':
                    pencarianBuku09.formatTabel();
                    data.tampil();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Masukkan kode buku yang ingin dicari: ");
                    System.out.print("Kode Buku: ");
                    kodeCari = s1.nextLine();
                    System.out.println("Dengan Sequential Search");
                    posisi = data.FindSeqSearch(kodeCari);
                    data.tampilPosisi(kodeCari, posisi);
                    data.tampilData(kodeCari, posisi);

                    System.out.println("\nDengan Binary Search");
                    posisi = data.findBinarySearch(kodeCari, 0, data.idx - 1);
                    data.tampilPosisi(kodeCari, posisi);
                    data.tampilData(kodeCari, posisi);
                    break;

                case '2':
                    pencarianBuku09.formatTabel();
                    data.sorting();
                    data.tampil();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Masukkan judul buku yang ingin dicari: ");
                    System.out.print("Judul Buku: ");
                    kodeCari = s1.nextLine();
                    System.out.println("Dengan Sequential Search");
                    posisi = data.judulBukuSeq(kodeCari);
                    data.tampilPosisi(kodeCari, posisi);
                    data.tampilDataJudul(kodeCari, posisi);

                    System.out.println("\nDengan Binary Search");
                    posisi = data.judulBinary(kodeCari, 0, data.idx - 1);
                    data.tampilPosisi(kodeCari, posisi);
                    data.tampilDataJudul(kodeCari, posisi);
                    break;
                case '3':
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Apakah ingin kembali ke menu utama? (y/n)");
            back = s1.nextLine().charAt(0);
        } while (back == 'y' || back == 'Y');

        // System.out.println("\nMethod findBuku");
        // buku09 dataBuku = data.findBUku(kodeCari);
        // if (dataBuku != null) {
        // pencarianBuku09.formatTabel();
        // dataBuku.tampilDataBuku();
        // } else {
        // System.out.println("Data: " + kodeCari + " Tidak Ditemukan");
        // }

        s1.close();
    }
}
