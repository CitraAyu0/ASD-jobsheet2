public class DosenMain05 {
    public static void main(String[] args) {

        Dosen05 dsn1 = new Dosen05();
        dsn1.idDosen = "D001";
        dsn1.nama = "Ahmad Maulana, S.T., M.T";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2017;
        dsn1.bidangKeahlian = "Basis Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Analisa Proses Bisnis");
        dsn1.tampilInformasi();

        Dosen05 dsn2 = new Dosen05("D002", "Prof. Siti Aminah", true, 2010, "Jaringan Komputer");
        
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Keamanan Siber");
        dsn2.tampilInformasi();
    }
}
