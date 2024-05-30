package P12.Tugas2;

import java.util.Scanner;

public class mainFilm09 {
    public static void main(String[] args) throws Exception {
        Scanner input09 = new Scanner(System.in);
        String menu[] = { "Tambah Data Awal", "Tambah Data Akhir", "Tambah Data Index Tertentu", "Hapus Data Pertama",
                "Hapus Data Terakhir", "Hapus Data Tertentu", "Cetak", "Cari ID Film", "Urut Rating Film-Desc",
                "Keluar" };
        dlsFilm09 film = new dlsFilm09();
        String id, judul;
        float rating;
        int pilih;
        do {
            System.out.println("+----------------------------+");
            System.out.println("    DATA FILM Layar Lebar");
            System.out.println("+----------------------------+");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("+----------------------------+");
            System.out.print("Pilih Menu : ");
            pilih = input09.nextInt();
            input09.nextLine();
            System.out.println("+----------------------------+");

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film");
                    System.out.print("ID Film: ");
                    id = input09.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input09.nextLine();
                    System.out.print("IMDB Rating: ");
                    rating = input09.nextFloat();
                    film09 film1 = new film09(id, judul, rating);
                    film.addFirst(film1);
                    break;
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film: ");
                    id = input09.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input09.nextLine();
                    System.out.print("IMDB Rating: ");
                    rating = input09.nextFloat();
                    film09 film2 = new film09(id, judul, rating);
                    film.addLast(film2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Posisi Index Tertentu");
                    System.out.print("ID Film: ");
                    id = input09.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input09.nextLine();
                    System.out.print("IMDB Rating: ");
                    rating = input09.nextFloat();
                    film09 film3 = new film09(id, judul, rating);
                    System.out.print("Data Film ini akan masuk di urutan ke- ");
                    int indexAdd = input09.nextInt();
                    film.add(film3, indexAdd);
                    break;
                case 4:
                    film.removeFirst();
                    System.out.println("Data Pertama Telah Terhapus");
                    break;
                case 5:
                    film.removeLast();
                    System.out.println("Data Terakhir Telah Terhapus");
                    break;
                case 6:
                    System.out.println("Masukkan Index Data yang Ingin Dihapus");
                    int indexRemove = input09.nextInt();
                    film.remove(indexRemove);
                    System.out.println("Data Index " + indexRemove + " Telah Terhapus");
                    break;
                case 7:
                    film.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film: ");
                    id = input09.nextLine();
                    film.findID(id);
                    break;
                case 9:
                    film.ratingDesc();
                    System.out.println("Data Film Telah Terurut Berdasarkan Descending IMDB Rating");
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (pilih != 0 && pilih <= 10);
        input09.close();
    }
}
