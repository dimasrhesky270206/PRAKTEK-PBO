public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    void tampilData() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
}
