package P5.SumArray;

import java.util.Scanner;

public class mainSum09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("Program Mengitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = input.nextInt();

        Sum09 sum = new Sum09(elm);
        System.out.println("==================================================================");
        for (int i = 0; i < sum.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
            sum.keuntungan[i] = input.nextDouble();
        }

        System.out.println("==================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total Keuntungan perusahaan selama " + sum.elemen + " bulan adalah " + sum.totalBF(sum.keuntungan));

        System.out.println("==================================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.printf(
                "Total Keuntungan perusahaan selama %d bulan adalah %.2f\n", sum.elemen,
                sum.totalDC(sum.keuntungan, 0, sum.elemen - 1));
    }
}
