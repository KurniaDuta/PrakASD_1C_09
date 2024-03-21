package P5.Pangkat;

import java.util.Scanner;

public class pangkatMain09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = input.nextInt();

        pangkat09[] png = new pangkat09[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat09();
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = input.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            png[i].pangkat = input.nextInt();
        }

        System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                    "Hasil penghitungan pangkat menggunakan Brute Force adalah "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " = "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                    "Hasil penghitungan pangkat menggunakan Divide and Conquer adalah "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " = "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
