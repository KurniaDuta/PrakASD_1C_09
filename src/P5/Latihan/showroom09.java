package P5.Latihan;

public class showroom09 {
    public String merk, tipe, tahun;
    public int top_accelaration;
    public double top_power;

    public showroom09(String merk, String tipe, String tahun, int top_accelaration, double top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_accelaration = top_accelaration;
        this.top_power = top_power;
    }

    // high itu r dan l itu low
    int[] findMinMax(showroom09[] arr, int l, int r) {
        int max, min;

        if (l == r) {
            return new int[] { arr[l].top_accelaration, arr[l].top_accelaration };
        } else if (l < r) {
            int mid = (l + r) / 2;
            int[] left = findMinMax(arr, l, mid);
            int[] right = findMinMax(arr, mid + 1, r);

            max = Math.max(left[1], right[1]);
            min = Math.min(left[0], right[0]);
            return new int[] { min, max };
        }
        return new int[] { 0, 0 };
    }

    public void tampilInfoAccelaration(showroom09[] arr, int accelaration) {
        for (showroom09 mobil : arr) {
            if (mobil.top_accelaration == accelaration) {
                System.out.println(mobil.merk + " " + mobil.tipe + " Tahun " + mobil.tahun + " dengan top accelaration sebesar " + mobil.top_accelaration);
                break;
            }
        }
    }

    double averagePower(showroom09[] arr){
        double sum = 0;
        for (showroom09 mobil : arr) {
            sum += mobil.top_power;
        }
        return sum / arr.length;
    }
}