package P10.Praktikum2;

import java.util.Scanner;

public class queueMainNasabah09 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian terbelakang");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = input.nextInt();
        input.nextLine();
        queueNasabah09 antri = new queueNasabah09(n);

        int pilih;
        do {
            menu();
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening: ");
                    String noRek = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = input.nextDouble();
                    nasabah09 nb  = new nasabah09(noRek, nama, alamat, umur, saldo);
                    antri.enqueue(nb);
                    break;
                case 2:
                    nasabah09 data = antri.dequeue();
                    if (!"".equals(data.noRek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                        && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar " + data.noRek + " " + data.nama + " " 
                        + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
