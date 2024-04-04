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

    public static void formatTabel() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", "Kode Buku", "JudulBuku", "Tahun Terbit",
                "Pengarang", "Stock");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            pencarianBuku09.formatTabel();
            System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", x, listBK[pos].judulBuku,
                    listBK[pos].tahunTerbit,
                    listBK[pos].pengarang, listBK[pos].stock);

        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }

    public buku09 findBUku(int cari) {
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku == cari) {
                return listBK[i];
            }
        }
        return null;
    }

    public int findBinarySearch(int cari, int left, int right) {
        int mid;

        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listBK[mid].kodeBuku) {
                return mid;
            } else if (cari < listBK[mid].kodeBuku) {
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

}
