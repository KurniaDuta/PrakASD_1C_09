package P1;

import java.util.Scanner;

public class Percobaan1_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");

        int tugas, kuis, UTS, UAS;

        System.out.print("Masukkan nilai tugas: ");
        tugas = input09.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        kuis = input09.nextInt();

        System.out.print("Masukkan nilai UTS: ");
        UTS = input09.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        UAS = input09.nextInt();

        if (tugas < 0 || kuis < 0 || UTS < 0 || UAS < 0 || UAS > 100 || UTS > 100 || kuis > 100 || tugas > 100) {
            System.out.println("================================");
            System.out.println("================================");
            System.out.println("Nilai tidak valid");
            System.out.println("================================");
            System.out.println("================================");
        } else {
            System.out.println("================================");
            System.out.println("================================");
            double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, UTS, UAS);
            System.out.println("\nNilai Akhir: " + nilaiAkhir);
            String huruf = nilaiHuruf(nilaiAkhir);
            System.out.println("Nilai Huruf: " + huruf);

            System.out.println("================================");
            System.out.println("================================");
            String keterangan = kelulusan(huruf);
            System.out.println(keterangan);
            System.out.println("================================");
            System.out.println("================================");
        }

    }

    public static String kelulusan(String huruf) {
        if (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) {
            return "SELAMAT ANDA LULUS";
        } else {
            return "MOHON MAAF ANDA TIDAK LULUS";
        }
    }

    public static String nilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            return "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            return "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            return "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            return "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int UTS, int UAS) {
        return ((0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.3 * UAS));
    }
}
