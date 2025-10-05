public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info(); 
        System.out.println("-----");

        Anjing anjing = new Anjing("Spike", 5, "Panjang"); 
        anjing.berjalan();
        anjing.menggonggong(); 
        System.out.println("Umur Anjing (protected): " + anjing.umur); 
        System.out.println("Jenis Bulu Anjing (private, via getter): " + anjing.getJenisBulu()); 
    }
}