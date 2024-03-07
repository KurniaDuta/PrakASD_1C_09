package P3.ArrayBalok;

public class sgArray09 {
    public static void main(String[] args) {
        Segitiga09[] sgArray = new Segitiga09[4];

        sgArray[0] = new Segitiga09(10, 4);
        sgArray[1] = new Segitiga09(20, 10);
        sgArray[2] = new Segitiga09(15, 6);
        sgArray[3] = new Segitiga09(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
            System.out.printf("Keliling segitiga ke-%d: %.2f\n", i, sgArray[i].hitungKeliling());
        }
    }
}
