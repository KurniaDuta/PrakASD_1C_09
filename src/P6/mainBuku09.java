package P6;

public class mainBuku09 {
    public static void main(String[] args) {
        daftarbuku09 listBuku = new daftarbuku09();

        buku09 m = new buku09(20215, "Algoritma", 2019, "Wahyuni", 5);
        buku09 m1 = new buku09(20214, "Big Data", 2020, "Susilo", 3);
        buku09 m2 = new buku09(20212, "Desain UI", 2021, "Supriadi", 6);
        buku09 m3 = new buku09(20211, "Web Programming", 2022, "Pustaka Adi", 2);
        buku09 m4 = new buku09(20210, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("===========================");
        System.out.println("Data sebelum diurutkan");
        listBuku.tampil();

        System.out.println("\n==========================");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
        listBuku.bubbleSort();
        listBuku.tampil();

        System.out.println("\n==========================");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan stock menggunakan selection sort");
        listBuku.selectionSort();
        listBuku.tampil();

        System.out.println("\n===========================");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan stock menggunakan insterion sort");
        listBuku.insertionSort();
        listBuku.tampil();

        System.out.println("\n===========================");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan stock menggunakan insterion sort");
        listBuku.insertionDesc();
        listBuku.tampil();
    }
}
