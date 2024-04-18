package P8;

public class gudang09 {
    barang09[] tumpukan;
    int size, top;

    public gudang09(int kapasitas) {
        size = kapasitas;
        top = -1;
        tumpukan = new barang09[size];
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(barang09 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahakan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public barang09 ambilBarang() {
        if (!cekKosong()) {
            barang09 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
            return null;
        }
    }

    public barang09 lihatBarangTeratas() {
        if (!cekKosong()) {
            barang09 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas di gudang adalah " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang");

            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        stackKonversi09 stack = new stackKonversi09();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public barang09 lihatBarangTerbawah() {
        if (!cekKosong()) {
            barang09 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah di gudang adalah " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public barang09 cariBarang(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.printf("Kode %d: %s (Kategori %s) ditemukan di gudang\n", tumpukan[i].kode, tumpukan[i].nama,
                    tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
}
