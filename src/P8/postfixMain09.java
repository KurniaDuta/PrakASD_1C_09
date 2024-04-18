package P8;

import java.util.Scanner;

public class postfixMain09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspreasi matematika (infix): ");
        Q = input.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        postfix09 post = new postfix09(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
