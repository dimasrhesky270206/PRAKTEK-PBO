

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0.0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlah + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(double jumlah) {
        if (jumlah > jumlahPinjaman) {
            jumlahPinjaman = 0;
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}


