package P15;

import java.util.Scanner;

public class graphMain09 {
    public static void main(String[] args) throws Exception {
        Scanner input09 = new Scanner(System.in);
        String menu[] = { "Add Edge", "Remove Edge", "Degree", "Print Graph", "Cek Edge", "Exit" };
        int pilih;

        System.out.print("Masukkan Jumlah Vertex: ");
        int vertex = input09.nextInt();
        graph09 gedung = new graph09(vertex);
        input09.nextLine();

        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("--------------------------");
            System.out.print("Pilih --> ");
            pilih = input09.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan vertex pertama: ");
                    int v1 = input09.nextInt();
                    System.out.println("Masukkan vertex kedua: ");
                    int v2 = input09.nextInt();
                    System.out.println("Masukkan Jarak: ");
                    int jarak = input09.nextInt();
                    gedung.addEdge(v1, v2, jarak);
                    break;
                case 2:
                    System.out.println("Masukkan vertex pertama: ");
                    int v11 = input09.nextInt();
                    System.out.println("Masukkan vertex kedua: ");
                    int v22 = input09.nextInt();
                    gedung.removeEdge(v11, v22);
                    break;
                case 3:
                    gedung.degree(0);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.println("Masukkan vertex pertama: ");
                    int v111 = input09.nextInt();
                    System.out.println("Masukkan vertex kedua: ");
                    int v222 = input09.nextInt();
                    gedung.hasPath(v111, v222);
                    break;
                case 6:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (pilih != 0 && pilih >= 5);
    }
}
