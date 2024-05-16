package P11.Tugas_P11.Tugas2;

public class queueMain09 {
    public static void main(String[] args) {
        SLSQueue09 q = new SLSQueue09();
        System.out.println("Antrian Layanan Mahasiswa: ");
        q.enqueue(new mhsQueue09("Anton", "111", "Cetak KHS"));
        q.enqueue(new mhsQueue09("Prita", "112", "Kompen"));
        q.enqueue(new mhsQueue09("Doni", "114", "Cetak Surat Tugas Lomba"));
        q.enqueue(new mhsQueue09("Yusuf", "113", "Kompen"));
        q.enqueue(new mhsQueue09("Sari", "115", "Pengajuan Magang"));
        q.print();

        System.out.println("+---------------------------------------+");
        System.out.println("\nAntrian Layanan Mahasiswa Terbaru: ");
        q.dequeue();
        q.dequeue();
        q.print();
    }
}
