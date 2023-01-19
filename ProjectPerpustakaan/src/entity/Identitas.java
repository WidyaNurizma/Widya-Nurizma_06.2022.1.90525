package entity;

import java.util.Date;

public abstract class Identitas {
    public String nama;
    protected String notelp;
    protected String alamat;
    protected Date tglLahir;

    public Identitas(String nama, String notelp, String alamat, Date tglLahir) {
        this.nama = nama;
        this.notelp = notelp;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}