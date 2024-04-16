package P7;

public class pencarianBuku09 {
    buku09 listBK[] = new buku09[6];
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

    public int FindSeqSearch(String cari) {
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku.equals(cari)) {
                return i;
            }
        }
        return -1;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            if (deteksiJudul(x) == 1) {
                System.out.println("Data: " + x + " ditemukan pada posisi ke-" + pos);
            }
        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            pencarianBuku09.formatTabel();
            System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", x, listBK[pos].judulBuku,
                    listBK[pos].tahunTerbit,
                    listBK[pos].pengarang, listBK[pos].stock);
        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }

    public void tampilDataJudul(String x, int pos) {
        if (pos != -1) {
            if (deteksiJudul(x) == 1) {
                pencarianBuku09.formatTabel();
                System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", listBK[pos].kodeBuku, x,
                        listBK[pos].tahunTerbit,
                        listBK[pos].pengarang, listBK[pos].stock);
            }
        } else {
            System.out.println("Data: " + x + " Tidak ditemukan");
        }
    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;

        if (left <= right) {
            mid = (left + right) / 2;
            int hasil = listBK[mid].kodeBuku.compareTo(cari);
            if (hasil == 0) {
                return mid;
            } else if (hasil < 0) {
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public static void formatTabel() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-9s | %-16s | %-16s | %-16s | %-6s%n", "Kode Buku", "JudulBuku", "Tahun Terbit",
                "Pengarang", "Stock");
        System.out.println("----------------------------------------------------------------------------");
    }

    // public buku09 findBUku(int cari) {
    // for (int i = 0; i < listBK.length; i++) {
    // if (listBK[i].kodeBuku == cari) {
    // return listBK[i];
    // }
    // }
    // return null;
    // }

    public int judulBukuSeq(String cari) {
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].judulBuku.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    public void sorting() {
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = i + 1; j < listBK.length; j++) {
                if (listBK[i].judulBuku.compareTo(listBK[j].judulBuku) > 0) {
                    buku09 tempBK = listBK[i];
                    listBK[i] = listBK[j];
                    listBK[j] = tempBK;
                }
            }
        }
    }

    public int judulBinary(String cari, int left, int right) {
        sorting();
        if (left <= right) {
            int mid = (left + right) / 2;
            int hasil = listBK[mid].judulBuku.compareToIgnoreCase(cari);
            if (hasil == 0) {
                return mid;
            } else if (hasil < 0) {
                return judulBinary(cari, mid + 1, right);
            } else {
                return judulBinary(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public int deteksiJudul(String judul) {
        int count = 0;
        for (buku09 buku : listBK) {
            if (buku.judulBuku.equalsIgnoreCase(judul) && buku != null) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Peringatan! Judul Buku Ditemukan Lebih Dari 1");
        }
        return count;
    }
}
