public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.menyusui();
        
        System.out.println("-----");
        
    
        Anjing anjing = new Anjing("Buddy", 3, "Pendek"); 
        anjing.menyusui(); 
        anjing.menggonggong(); 
        
        System.out.println("Umur " + anjing.nama + " adalah " + anjing.umur + " tahun.");
    }
}