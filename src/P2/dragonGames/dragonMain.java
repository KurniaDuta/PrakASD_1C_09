package P2.dragonGames;

import java.util.Scanner;

public class dragonMain {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        String inputStep;
        dragon dragon = new dragon(0, 0, 10, 10);

        do {
            System.out.println("\nMasukkan Step (A/W/S/D): ");
            inputStep = input09.next().toUpperCase();
            switch (inputStep) {
                case "A":
                    dragon.moveLeft();
                    break;
                case "W":
                    dragon.moveUp();
                    break;
                case "S":
                    dragon.moveDown();
                    break;
                case "D":
                    dragon.moveRight();
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
            dragon.printPosition();
        } while (!inputStep.equalsIgnoreCase("q")); // q untuk quit :)
    }
}
