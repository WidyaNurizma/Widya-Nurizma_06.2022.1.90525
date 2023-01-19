package entity;

public class BukuEntity {
    private int id;
    private String judul;
    private String penulis;
    private String penerbit;
    private String tahunTerbit;
    private int jumlahHalaman;

    public BukuEntity(int id, String judul, int jumlahHalaman, String tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.penulis = "-";
        this.penerbit = "-";
    }

    public BukuEntity(int id, String judul, String penulis, String penerbit, int jumlahHalaman, String tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

}
