package minggu5;

public class MainNilai08 {
    public static void main(String[] args) {
        Mahasiswa08[] mahasiswa08 = {
                new Mahasiswa08("Ahmad", "220101001", 2022, 78, 82),
                new Mahasiswa08("Budi", "220101002", 2022, 85, 88),
                new Mahasiswa08("Cindy", "220101003", 2021, 90, 87),
                new Mahasiswa08("Dian", "220101004", 2021, 76, 79),
                new Mahasiswa08("Eko", "220101005", 2023, 92, 95),
                new Mahasiswa08("Fajar", "220101006", 2020, 80, 83),
                new Mahasiswa08("Gina", "220101007", 2023, 80, 83),
                new Mahasiswa08("Hadi", "220101008", 2020, 82, 84)
        };

        int[] nilaiUTS08 = new int[mahasiswa08.length];
        int[] nilaiUAS08 = new int[mahasiswa08.length];

        for (int i = 0; i < mahasiswa08.length; i++) {
            nilaiUTS08[i] = mahasiswa08[i].nilaiUTS08;
            nilaiUAS08[i] = mahasiswa08[i].nilaiUAS08;
        }

        int nilaiMax08 = OperasiNilai08.cariMaxUTS08(nilaiUTS08, 0, nilaiUTS08.length - 1);
        int nilaiMin08 = OperasiNilai08.cariMinUTS08(nilaiUTS08, 0, nilaiUTS08.length - 1);
        double rataUAS08 = OperasiNilai08.rataRataUAS08(nilaiUAS08);

        System.out.println("Nilai UTS Tertinggi: " + nilaiMax08);
        System.out.println("Nilai UTS Terendah: " + nilaiMin08);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS08);
    }
}
