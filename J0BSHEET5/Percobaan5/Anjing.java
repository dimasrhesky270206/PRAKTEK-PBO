class Anjing extends Hewan {
    private String jenisBulu;
    public Anjing(String nama, int umur, String jenisBulu) {
        
        super(nama, umur);
        this.jenisBulu = jenisBulu;
        System.out.println("Konstruktor Anjing dipanggil");
    }

    public void menggonggong() {
        System.out.println("Anjing menggonggong: Guk Guk!");
    }

    public String getJenisBulu() {
        return jenisBulu;
    }
}
