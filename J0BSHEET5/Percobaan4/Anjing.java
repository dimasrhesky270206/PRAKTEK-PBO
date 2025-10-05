class Anjing extends Mamalia {
    String jenisBulu; 

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur); 
        this.jenisBulu = jenisBulu;
        System.out.println("Konstruktor Anjing dipanggil. Jenis Bulu: " + jenisBulu);
    }
    void menggonggong() {
        System.out.println(super.nama + " (Anjing) menggonggong: Guk Guk!");
    }
}