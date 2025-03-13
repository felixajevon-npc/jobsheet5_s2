package minggu5;

public class OperasiNilai08 {
    static int cariMaxUTS08(int[] arr08, int l08, int r08) {
        if (l08 == r08) {
            return arr08[l08];
        }
        int mid08 = (l08 + r08) / 2;
        int maxKiri08 = cariMaxUTS08(arr08, l08, mid08);
        int maxKanan08 = cariMaxUTS08(arr08, mid08 + 1, r08);
        return Math.max(maxKiri08, maxKanan08);
    }

    static int cariMinUTS08(int[] arr08, int l08, int r08) {
        if (l08 == r08) {
            return arr08[l08];
        }
        int mid08 = (l08 + r08) / 2;
        int minKiri08 = cariMinUTS08(arr08, l08, mid08);
        int minKanan08 = cariMinUTS08(arr08, mid08 + 1, r08);
        return Math.min(minKiri08, minKanan08);
    }

    static double rataRataUAS08(int[] arr08) {
        int total08 = 0;
        for (int nilai08 : arr08) {
            total08 += nilai08;
        }
        return (double) total08 / arr08.length;
    }
}