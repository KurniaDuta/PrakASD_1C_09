package P15;

public class graphMatriks09 {
    int vertex;
    int[][] matriks;

    public graphMatriks09(int v) {
        vertex = v;
        matriks = new int[vertex][vertex];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        if (asal < 0 || asal >= vertex) {
            System.out.println("Invalid input for `asal`.");
            return;
        }
        
        int totalIn = 0, totalOut = 0;
        
        for (int j = 0; j < vertex; j++) {
            if (matriks[asal][j] != -1) {
                totalOut++;
            }
        }
        
        for (int i = 0; i < vertex; i++) {
            if (i != asal) {
                if (matriks[i][asal] != -1) {
                    totalIn++;
                }
            }
        }
        
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }
}
