package JOBSHEET3;

public class GetterSetter {
    private String nama;
    private String alamat;
    private double simpanan;

    public Anggota() {
        this.nama = "";
        this.alamat = "";
        this.simpanan = 0;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public double getSimpanan() {
        return simpanan;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            simpanan += jumlah;
        } else {
            System.out.println("Jumlah setor harus positif.");
        }
    }

    public void pinjam(double jumlah) {
        if (jumlah > 0) {
            simpanan -= jumlah; // catatan: di konteks koperasi biasanya penanganan lebih kompleks
        } else {
            System.out.println("Jumlah pinjam harus positif.");
        }
    }
}
