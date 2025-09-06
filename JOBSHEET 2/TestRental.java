public class TestRental {
    public static void main(String[] args) {
        Rental sewa1 = new Rental();
        sewa1.id = "M001";
        sewa1.namaMember = "Dimas";
        sewa1.namaGame = "FIFA 23";
        sewa1.lamaSewa = 5;
        sewa1.hargaPerHari = 10000;

        sewa1.tampilData();
    }
}
