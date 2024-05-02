package P10.Tugas;

import java.util.Scanner;

public class pembeliMain09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas pembeli: ");
        int n = input09.nextInt();
        input09.nextLine();
        queuePembeli09 pembeli = new queuePembeli09(n);

        String menu[] = { "Enqueue", "Dequeue", "Cek Semua Antrian", "Cek Antrian Terdepan",
                "Cek Antrian Terbelakang", "Cari Nomor Antrian", "Cetak Daftar Pembeli" };
        int pilih;
        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("--> ");
            pilih = input09.nextInt();
            input09.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = input09.nextLine();
                    System.out.print("Masukkan nomor Hp: ");
                    String noHp = input09.nextLine();
                    pembeli09 pb = new pembeli09(nama, noHp);
                    pembeli.enqueue(pb);
                    break;
                case 2:
                    pembeli09 data = pembeli.dequeue();
                    if (data != null) {
                        System.out.println(data.nama + " telah keluar dari antrian");
                    }
                    break;
                case 3:
                    pembeli.print();
                    break;
                case 4:
                    pembeli.peek();
                    break;
                case 5:
                    pembeli.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama untuk mencari nomor antrian: ");
                    String cari = input09.nextLine();
                    pembeli.peekPosition(cari);
                    break;
                case 7:
                    pembeli.daftarPembeli();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
