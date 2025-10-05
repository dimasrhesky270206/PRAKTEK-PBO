import java.util.Scanner;

class Persegi {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    
    void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    
    int luasPersegi() {
        return sisi * sisi;
    }

    
    int kelilingPersegi() {
        return 4 * sisi;
    }
}

  
public class TampilPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        Persegi p = new Persegi(sisi);    

        
        p.dataPersegi();
        System.out.println("Luas persegi: " + p.luasPersegi());
        System.out.println("Keliling persegi: " + p.kelilingPersegi());

        input.close();
    }
}
