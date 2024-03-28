package P6.Latihan;

import java.util.Scanner;

public class mainHotel09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char back;

        hotelService09 hotelService = new hotelService09();

        hotel09 H = new hotel09("Hotel Pop", "Yogyakarta", 280_000, (byte) 3);
        hotel09 H1 = new hotel09("Hotel Ibis", "Malang", 400_000, (byte) 4);
        hotel09 H2 = new hotel09("Hotel Fave Kuta", "Bali", 380_000, (byte) 5);
        hotel09 H3 = new hotel09("Hotel Merdeka", "Bekasi", 60_000, (byte) 1);
        hotel09 H4 = new hotel09("Hotel Melati", "Surabaya", 90_000, (byte) 2);

        hotelService.tambah(H);
        hotelService.tambah(H1);
        hotelService.tambah(H2);
        hotelService.tambah(H3);
        hotelService.tambah(H4);

        System.out.println("========== Data Hotel ==========");
        hotelService.tampilAll();

        do {
            System.out.println("\nFilter Hotel: \n1. Harga Termurah\n2. Bintang Tertinggi");
            System.out.print("--> ");
            char filter = input.next().charAt(0);

            switch (filter) {
                case '1':
                    System.out.println("Pengurutan Harga Termurah dengan Bubble Sort");
                    hotelService.bubleSortHarga();
                    hotelService.tampilAll();
                    System.out.println("\nPengurutan Harga Termurah dengan Selection Sort");
                    hotelService.selectionSortHarga();
                    hotelService.tampilAll();
                    break;
                case '2':
                    System.out.println("Pengurutan Bintang Tertinggi dengan Bubble Sort");
                    hotelService.bubleSortBintang();
                    hotelService.tampilAll();
                    System.out.println("\nPengurutan Bintang Tertinggi dengan Selection Sort");
                    hotelService.selectionSortBintang();
                    hotelService.tampilAll();
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }

            System.out.println("\nApakah anda ingin kembali ke menu filter hotel(Y/N)? ");
            back = input.next().charAt(0);
        } while (back == 'y' || back == 'Y');

        input.close();
    }
}
