public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah05() {
    }

    public MataKuliah05(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("-----------------------------------");
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jam yang tersisa tidak cukup.");
        }
    }
}
