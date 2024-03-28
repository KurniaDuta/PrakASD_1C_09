package P6;

public class daftarbuku09 {
    buku09 listBK[] = new buku09[5];
    int idx;

    void tambah(buku09 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for(buku09 m : listBK){
            m.tampilDataBuku();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - i - 1; j++) {
                if (listBK[j].stock > listBK[j+1].stock) {
                    buku09 tempBK = listBK[j];
                    listBK[j] = listBK[j+1];
                    listBK[j+1] = tempBK;
                }
            }
        }
    }
}
