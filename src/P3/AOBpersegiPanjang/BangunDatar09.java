package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga09;

public class BangunDatar09 {
    Segitiga09[] segitigas;
    PersegiPanjang09[] persegiPanjangs;

    void tambahSgtg(Segitiga09[] segitiga) {
        this.segitigas = segitiga;
    }

    void tambahPp(PersegiPanjang09[] persegiPanjang) {
        this.persegiPanjangs = persegiPanjang;
    }

    void tampilBangunDatar() {
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.println("Panjang: " + persegiPanjangs[i].panjang);
            System.out.println("Lebar: " + persegiPanjangs[i].lebar);
        }
        System.out.println("=============================");
        for (int j = 0; j < segitigas.length; j++) {
            System.out.println("Segitiga ke-" + (j+1));
            System.out.println("Alas: " + segitigas[j].alas);
            System.out.println("Tinggi: " + segitigas[j].tinggi);
        }
    }
}
