package Entity;

import java.util.Date;

public class Induk {
    public String nama;
    protected String password;
    protected String notelp;
    protected String alamat;
    protected Date tglLahir;
    public int indexbuku;
    public int indexadmin;

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
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

    public int getIndexbuku() {
        return indexbuku;
    }

    public int getIndexadmin() {
        return indexadmin;
    }
    
    
}