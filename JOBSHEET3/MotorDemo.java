package JOBSHEET3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor m = new Motor();
        m.printStatus();
        m.nyalakanMesin();
        m.tambahKecepatan(); 
        System.out.println("Kecepatan sekarang: " + m.getKecepatan());
        m.matikanMesin();
        System.out.println("Kecepatan setelah mesin dimatikan: " + m.getKecepatan());
    }
}

