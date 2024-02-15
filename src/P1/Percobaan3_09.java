package P1;

import java.util.Scanner;

public class Percobaan3_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        double[] nilaiMK = new double[8];
        String[] matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Kselematan dan Kesehatan Kerja" };
        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };

        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];

        int totalSKS = 0;
        double totalNilaiMK = 0;
        
        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");
        for (int i = 0; i < nilaiMK.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiMK[i] = input09.nextDouble();
            if (nilaiMK[i] > 80 && nilaiMK[i] <= 100 ) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiMK[i] > 73 && nilaiMK[i] <= 80 ) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiMK[i] > 65 && nilaiMK[i] <= 73 ) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiMK[i] > 60 && nilaiMK[i] <= 65 ) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiMK[i] > 50 && nilaiMK[i] <= 60 ) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiMK[i] > 39 && nilaiMK[i] <= 50 ) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        
        for (int i = 0; i < sks.length; i++) {
            totalNilaiMK += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilaiMK / totalSKS;

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-50s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-50s %-15s %-15s %-15s\n", matkul[i], nilaiMK[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("=================================");
        System.out.printf("IP : %.2f\n", ip);
    }
}
