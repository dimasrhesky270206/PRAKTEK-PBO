public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    
    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void gantiGear(int newGear) {
        gear = newGear;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("-----------------------");
    }
}
