package P1;

public class Percobaan4_09 {
    public static void main(String[] args) {
        int royalGarden[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        hargaPenjualan(royalGarden);
        royalGarden4(royalGarden);
    }

    static int hargaPenjualan(int[][] royalGarden) {
        System.out.println("Pendapatan Royal Garden");

        int hargaBunga[] = {75000, 50000, 60000, 10000};

        for (int i = 0; i < royalGarden.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < royalGarden[i].length; j++) {
                totalPenjualan += royalGarden[i][j] * hargaBunga[j];
            }
            System.out.println("Royal Garden " + (i+1) + " = " + totalPenjualan);
        }
        return 0;
    }

    static int royalGarden4 (int[][] royalGarden) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] updateStock = {-1, -2, -0, -5};

        System.out.println("\nStock Bunga Royal Garden 4");
        for (int i = 0; i < updateStock.length; i++) {
            System.out.println(namaBunga[i] + " = " + royalGarden[3][i]);
        }

        System.out.println("\nUpdate Stock Bunga Royal Garden 4");
        for (int i = 0; i < royalGarden[3].length; i++) {
            int jumlahStock = royalGarden[3][i] + updateStock[i];
            System.out.println(namaBunga[i] + " = " + jumlahStock);
        }
        return 0;
    }
}
