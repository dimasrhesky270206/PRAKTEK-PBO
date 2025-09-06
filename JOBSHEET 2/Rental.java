public class Rental {
    String id;
    String namaMember;
    String namaGame;
    int lamaSewa;   // dalam hari
    int hargaPerHari;

    int hitungTotalBayar() {
        return lamaSewa * hargaPerHari;
    }

    void tampilData() {
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga per Hari: Rp " + hargaPerHari);
        System.out.println("Total Bayar   : Rp " + hitungTotalBayar());
    }
}
