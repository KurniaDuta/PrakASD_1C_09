package P12.Tugas1;

import java.util.Scanner;

public class vaksinMain09 {
    public static void main(String[] args) throws Exception {
        Scanner input09 = new Scanner(System.in);
        String menu[] = { "Tambah Data Penerima Vaksin", "Hapus Data Pengantri Vaksin", "Daftar Penerima Vaksin",
                "Keluar" };
        dlsVaksin09 dls = new dlsVaksin09();
        int pilih;

        do {
            System.out.println("\n+---------------------------------+");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+---------------------------------+");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("Pilih menu: ");
            pilih = input09.nextInt();
            input09.nextLine();
            System.out.println("+---------------------------------+");

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("Nomor Antrian: ");
                    String noAntri = input09.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = input09.nextLine();
                    vaksin09 vaksin = new vaksin09(nama, noAntri);
                    dls.addData(vaksin);
                    break;
                case 2:
                    if (!dls.isEmpty()) {
                        vaksin09 vaksinRemove = dls.getDataRemove();
                        System.out.printf("%s - %s telah selesai divaksinasi", vaksinRemove.nomor,
                                vaksinRemove.nama);
                        dls.removeData();
                    } else {
                        System.out.println("Data Antrian Pasien Kosong!");
                    }
                    break;
                case 3:
                    dls.print();
                    System.out.println("Sisa Antrian: " + dls.size());
                    break;
                case 4:
                    System.exit(0);

                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
        input09.close();
    }
}
