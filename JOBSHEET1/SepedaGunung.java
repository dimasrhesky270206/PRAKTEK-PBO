public class SepedaGunung extends Sepeda {
    String tipeSuspensi;

    void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}
