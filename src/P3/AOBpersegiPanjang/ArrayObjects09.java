package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayObjects09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        PersegiPanjang09[][] ppArray = new PersegiPanjang09[3][3];

        for (int i = 0; i < ppArray[0].length; i++) {
            ppArray[i][i] = new PersegiPanjang09();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i][i].panjang = input.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i][i].lebar = input.nextInt();
        }

        for (int i = 0; i < ppArray[0].length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i][i].panjang + ", Lebar: " + ppArray[i][i].lebar);
        }
    }
}
