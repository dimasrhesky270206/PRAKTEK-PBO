public class Anjing extends Hewan {
    public Anjing(String nama) { 
        super(nama);
    }
    
    void menggonggong() {
        System.out.println("guk guk");
    }

      @Override
    void bersuara() {
        System.out.println("guk guk");
    }
}