class Hewan {
    String nama;
    int umur;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    void cetakInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}


class Kucing extends Hewan {
    String ras;
    String warnaBulu;

    void mengeong() {
        System.out.println(nama + " mengeong: Meow!");
    }

    void cakar() {
        System.out.println(nama + " mencakar.");
    }

    @Override
    void cetakInfo() {
        super.cetakInfo();
        System.out.println("Ras: " + ras + ", Warna bulu: " + warnaBulu);
    }
}


class Anjing extends Hewan {
    String jenis;
    String warnaBulu;

    void menggonggong() {
        System.out.println(nama + " menggonggong: Guk guk!");
    }

    void lari() {
        System.out.println(nama + " berlari cepat.");
    }

    @Override
    void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: " + jenis + ", Warna bulu: " + warnaBulu);
    }
}


class Burung {
    String jenis;
    String warnaBulu;

    void terbang() {
        System.out.println(jenis + " sedang terbang.");
    }

    void berkicau() {
        System.out.println(jenis + " berkicau merdu.");
    }

    void cetakInfo() {
        System.out.println("Jenis: " + jenis + ", Warna bulu: " + warnaBulu);
    }
}


public class Demo {
    public static void main(String[] args) {
    
        Hewan h1 = new Hewan();
        h1.nama = "Hewan Umum";
        h1.umur = 5;
        h1.cetakInfo();
        h1.makan();

        
        Kucing k1 = new Kucing();
        k1.nama = "Kitty";
        k1.umur = 2;
        k1.ras = "Anggora";
        k1.warnaBulu = "Putih";
        k1.cetakInfo();
        k1.mengeong();
        k1.cakar();


        Anjing a1 = new Anjing();
        a1.nama = "Buddy";
        a1.umur = 3;
        a1.jenis = "Bulldog";
        a1.warnaBulu = "Coklat";
        a1.cetakInfo();
        a1.menggonggong();
        a1.lari();

        Burung b1 = new Burung();
        b1.jenis = "Kenari";
        b1.warnaBulu = "Kuning";
        b1.cetakInfo();
        b1.terbang();
        b1.berkicau();
    }
}

