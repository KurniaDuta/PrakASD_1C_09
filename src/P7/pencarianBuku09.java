package P7;

public class pencarianBuku09 {
    buku09 listBK[] = new buku09[5];
    int idx;

    void tambah(buku09 bk) {
        if (idx < listBK.length) {
            listBK[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (buku09 buku09 : listBK) {
            buku09.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku == cari) {
                return i;
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada posisi ke-" + pos);
        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", "kodeBuku", "judulBuku", "tahunTerbit",
                    "pengarang", "stock");
            System.out.println(
                    "-----------------------------------------------------------------------------------");
            System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", x, listBK[pos].judulBuku, listBK[pos].tahunTerbit,
                    listBK[pos].pengarang, listBK[pos].stock);

        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }
}
