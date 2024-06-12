package P15;

import java.util.Scanner;

public class graphMain09 {
    public static void main(String[] args) throws Exception {
        Scanner input09 = new Scanner(System.in);
        graph09 gedung = new graph09(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal = input09.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = input09.nextInt();
        gedung.hasPath(asal, tujuan);


        //Graph Matriks
        // graphMatriks09 gdg = new graphMatriks09(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("\nHasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
    }
}
