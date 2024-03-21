package P5.Pangkat;

import java.util.Scanner;

public class pangkatMain09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char back;

        System.out.println("==============================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = input.nextInt();

        pangkat09[] png = new pangkat09[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = input.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = input.nextInt();

            png[i] = new pangkat09(nilai, pangkat);
        }

        do {
            System.out.println("\nPilih algoritma yang diinginkan: \n1. Brute Force \n2. Divide and Conquer");
            System.out.print("--> ");
            char pilih = input.next().charAt(0);

            switch (pilih) {
                case '1':
                    System.out.println("HASIL PANGKAT - BRUTE FORCE");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println(
                                "Hasil penghitungan pangkat menggunakan Brute Force adalah "
                                        + png[i].nilai + " pangkat "
                                        + png[i].pangkat + " = "
                                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case '2':
                    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println(
                                "Hasil penghitungan pangkat menggunakan Divide and Conquer adalah "
                                        + png[i].nilai + " pangkat "
                                        + png[i].pangkat + " = "
                                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println("===========================");
            System.out.print("Apakah anda ingin kembali ke menu(y/n)? ");
            back = input.next().charAt(0);
        } while (back == 'y' || back == 'Y');
    }
}
