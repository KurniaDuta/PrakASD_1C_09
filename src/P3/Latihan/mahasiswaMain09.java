package P3.Latihan;

public class mahasiswaMain09 {
    public static void main(String[] args) {
        mahasiswa09[] daftarMahasiswa = new mahasiswa09[3];

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nMasukkan Data Mahasiswa ke-" + (i+1));
            daftarMahasiswa[i] = new mahasiswa09("", "", ' ', 0.0);
            daftarMahasiswa[i].inputMahasiswa();
        }

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            daftarMahasiswa[i].tampilInfo();
        }
    }
}
