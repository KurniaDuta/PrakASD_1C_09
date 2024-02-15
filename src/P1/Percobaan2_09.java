package P1;

import java.util.Scanner;

public class Percobaan2_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.println("Masukkan NIM: ");
        long nim = input09.nextLong();
        System.out.println("=================================");

        int n = (int) (nim % 100);
        n = (n < 10) ? n + 10 : n;
        System.out.println("n: " + n);
        for (int i = 1; i <= n; i++) {
            System.out.print((i % 2 == 1) ? "*" : i);
        }
    }
}
