package P11.Tugas_P11.Tugas1;

public class mahasiswaMain09 {
    public static void main(String[] args) {
        singleLSMhs09 list = new singleLSMhs09();
        mahasiswa09 mhs = new mahasiswa09("Anton", "111");
        list.addFirst(mhs);

        mhs = new mahasiswa09("Prita", "112");
        list.addLast(mhs);

        mhs = new mahasiswa09("Doni", "114");
        list.insertAt(2, mhs);

        mhs = new mahasiswa09("Yusuf", "113");
        list.insertAfter("112", mhs);

        mhs = new mahasiswa09("Sari", "115");
        list.insertAfter("114", mhs);

        list.print();
    }
}
