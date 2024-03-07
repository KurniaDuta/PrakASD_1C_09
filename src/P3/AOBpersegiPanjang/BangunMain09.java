package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga09;

public class BangunMain09 {
    public static void main(String[] args) {
        Segitiga09 sg1 = new Segitiga09(5, 10);
        Segitiga09 sg2 = new Segitiga09(10, 15);
        Segitiga09 sg3 = new Segitiga09(15, 20);
        PersegiPanjang09 pp1 = new PersegiPanjang09(5, 10);
        PersegiPanjang09 pp2 = new PersegiPanjang09(2, 8);
        PersegiPanjang09 pp3 = new PersegiPanjang09(10, 15);

        Segitiga09[] s = new Segitiga09[3];
        PersegiPanjang09[] p = new PersegiPanjang09[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        BangunDatar09 bd = new BangunDatar09();
        bd.tambahSgtg(s);
        bd.tambahPp(p);
        bd.tampilBangunDatar();
    }
}
