public class TestBarangDiskon {
    public static void main(String[] args) {
        BarangDiskon brg1 = new BarangDiskon();
        brg1.kode = "BRG002";
        brg1.namaBarang = "PlayStation 5";
        brg1.hargaDasar = 8000000;
        brg1.diskon = 0.15f; // 15%

        brg1.tampilData();
    }
}
