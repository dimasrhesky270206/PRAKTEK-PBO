public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "BRG001";
        brg1.namaBarang = "Laptop";
        brg1.hargaDasar = 5000000;
        brg1.diskon = 0.1f;
        brg1.tampilData();
    }
}
