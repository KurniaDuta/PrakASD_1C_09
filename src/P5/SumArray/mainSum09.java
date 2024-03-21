package P5.SumArray;

import java.util.Scanner;

public class mainSum09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("Program Mengitung Keuntungan Total (Satuan Juta. Misal 5.9)");


        System.out.println("==================================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPerusahaan = input.nextInt();

        Sum09[] perusahaan = new Sum09[jmlPerusahaan];

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.print("\nMasukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int elm = input.nextInt();

            perusahaan[i] = new Sum09(elm);

            System.out.println("==================================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " perusahaan ke-" + (i + 1) + "= ");
                perusahaan[i].keuntungan[j] = input.nextDouble();
            }
        }

        System.out.println("==================================================================");
        System.out.println("\nAlgoritma Brute Force");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println(
                    "Total Keuntungan perusahaan ke-" + (i + 1) + " selama "
                            + perusahaan[i].elemen + " bulan adalah "
                            + perusahaan[i].totalBF(perusahaan[i].keuntungan));
        }

        System.out.println("==================================================================");
        System.out.println("Algoritma Divide and Conquer");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.printf(
                    "Total Keuntungan perusahaan ke-%d selama %d bulan adalah %.2f\n", (i + 1), perusahaan[i].elemen,
                    perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, (perusahaan[i].elemen - 1)));
        }
    }
}
