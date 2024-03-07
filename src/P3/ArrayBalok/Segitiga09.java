package P3.ArrayBalok;

import java.lang.Math;

public class Segitiga09 {
    public int alas;
    public int tinggi;

    public Segitiga09(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}
