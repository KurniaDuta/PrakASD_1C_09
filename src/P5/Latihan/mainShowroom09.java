package P5.Latihan;

public class mainShowroom09 {
    public static void main(String[] args) {
        showroom09[] showroom = new showroom09[8];

        showroom[0] = new showroom09("BMW", "M2 Coupe", "2016", 6816, 728);
        showroom[1] = new showroom09("Ford", "Fiesta ST", "2014", 3921, 575);
        showroom[2] = new showroom09("Nissan", "370Z", "2009", 4360, 657);
        showroom[3] = new showroom09("Subaru", "BRZ", "2014", 4058, 609);
        showroom[4] = new showroom09("Subaru", "Impreza WRX STI", "2013", 6255, 703);
        showroom[5] = new showroom09("Toyota", "AE86 Trueno", "1986", 3700, 553);
        showroom[6] = new showroom09("Toyota", "86/GT86", "2014", 4180, 609);
        showroom[7] = new showroom09("Volkswagen", "Golf GTI", "2014", 4180, 631);


        int[] minMax = showroom[0].findMinMax(showroom, 0, showroom.length - 1);
        System.out.println("Mobil dengan accelaration terendah:");
        showroom[0].tampilInfoAccelaration(showroom, minMax[0]);
        System.out.println("\nMobil dengan accelaration tertinggi:");
        showroom[0].tampilInfoAccelaration(showroom, minMax[1]);

        double averagePower = showroom[0].averagePower(showroom);
        System.out.println("\nRata-rata top power semua mobil: " + averagePower);
    }
}
