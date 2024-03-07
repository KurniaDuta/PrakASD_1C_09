package P3.ArrayBalok;

public class ArrayBalok09 {
    public static void main(String[] args) {
        Balok09[] balokArray = new Balok09[3];

        balokArray[0] = new Balok09(100, 30, 12);
        balokArray[1] = new Balok09(120, 40, 15);
        balokArray[2] = new Balok09(210, 50, 25);

        for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Volume balok ke-" + i + ": " + balokArray[i].hitungVolume());
        }
    }
}
