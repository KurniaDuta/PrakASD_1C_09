package P1;

import java.util.Scanner;

public class Tugas2_09 {
    static Scanner input09 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu Rumus-Rumus Fisika");
        System.out.println("========================");
        System.out.println("1. Kecepatan\n2. Jarak\n3. Waktu");
        System.out.print("--> ");
        String menu = input09.next();

        switch (menu) {
            case "1":
                kecepatan();
                break;
            case "2":
                jarak();
                break;
            case "3":
                waktu();
                break;
        
            default:
                break;
        }
    }
    static void kecepatan() {
        System.out.print("Masukkan jarak (m): ");
        double jarak = input09.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        double Waktu = input09.nextDouble();

        double kecepatan = jarak / Waktu;
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    static void jarak() {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input09.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        double Waktu = input09.nextDouble();

        double jarak = kecepatan * Waktu;
        System.out.println("Jarak: " + jarak + " m");
    }

    static void waktu() {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input09.nextDouble();

        System.out.print("Masukkan jarak (m): ");
        double jarak = input09.nextDouble();

        double Waktu = jarak / kecepatan;
        System.out.println("Waktu: " + Waktu + " s");
    }
}
