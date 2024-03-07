package P3.Latihan;

import java.util.Scanner;

public class mahasiswa09 {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public mahasiswa09(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;   
    }

    void inputMahasiswa(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        this.nama = input.next();

        System.out.print("Masukkan NIM: ");
        this.nim = input.next();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        this.jenisKelamin = input.next().charAt(0);

        System.out.print("Masukkan IPK: ");
        this.ipk = input.nextDouble();
    }

    void tampilInfo(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println("Nilai IPK: " + this.ipk);
    }
}
