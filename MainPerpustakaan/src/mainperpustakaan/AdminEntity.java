package mainperpustakaan;

import java.util.Date;
public class AdminEntity extends Induk {

    public AdminEntity(String nama, String password, String notelp, String alamat, Date tglLahir) {
        super.nama = nama;
        super.password = password;
        super.notelp = notelp;
        super.alamat = alamat;
        super.tglLahir = tglLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getIndexbuku() {
        return indexbuku;
    }

    public void setIndexbuku(int indexbuku) {
        this.indexbuku = indexbuku;
    }

    public int getIndexadmin() {
        return indexadmin;
    }

    public void setIndexadmin(int indexadmin) {
        this.indexadmin = indexadmin;
    }
}