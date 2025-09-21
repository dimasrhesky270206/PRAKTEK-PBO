package JOBSHEET3;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int MAX_KECEPATAN = 100;

    public void nyalakanMesin() {
        kontakOn = true;
        System.out.println("Mesin dinyalakan.");
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
        System.out.println("Mesin dimatikan.");
    }

    public void tambahKecepatan() {
        if (!kontakOn) {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
            return;
        }
        if (kecepatan < MAX_KECEPATAN) {
            kecepatan += 10; 
            if (kecepatan > MAX_KECEPATAN) kecepatan = MAX_KECEPATAN;
        } else {
            System.out.println("Kecepatan sudah maksimum.");
        }
    }

    public void kurangiKecepatan() {
        if (!kontakOn) {
            System.out.println("Mesin Off! Tidak ada kecepatan untuk dikurangi.");
            return;
        }
        if (kecepatan > 0) {
            kecepatan -= 10;
            if (kecepatan < 0) kecepatan = 0;
        } else {
            System.out.println("Kecepatan sudah 0.");
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    
}
