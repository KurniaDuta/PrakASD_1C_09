package P5.Faktorial;

import java.util.Scanner;

public class faktorialMain09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Masukkan bilangan: ");
        int iJml = input.nextInt();

        faktorial09[] fk = new faktorial09[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial09();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = input.nextInt();
        }

        System.out.println("\nHASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Brute Force adalah " 
                    + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("\nHASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " 
                    + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
