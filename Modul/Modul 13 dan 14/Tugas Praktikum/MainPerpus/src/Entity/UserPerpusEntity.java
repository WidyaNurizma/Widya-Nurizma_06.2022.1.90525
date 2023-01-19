package Entity;
import java.util.Date;

public class UserPerpusEntity extends Induk{

    public UserPerpusEntity(String nama, String password, String notelp, String alamat, Date tglLahir, int indexbuku, int indexadmin) {
        super.nama = nama;
        super.password = password;
        super.notelp = notelp;
        super.alamat = alamat;
        super.tglLahir = tglLahir;
        super.indexbuku = indexbuku;
        super.indexadmin = indexadmin;
    }

    public UserPerpusEntity(String password, String nama, String notelp, Date tglLahir, String alamat) {
        super.nama = nama;
        super.password = password;
        super.notelp = notelp;
        super.alamat = alamat;
        super.tglLahir = tglLahir;
    }

    @Override
    public int getIndexbuku() {
        return indexbuku;
    }

    public void setIndexbuku(int indexbuku) {
        this.indexbuku = indexbuku;
    }
    
    @Override
    public int getIndexadmin() {
        return indexadmin;
    }

    public void setIndexadmin(int indexadmin) {
        this.indexadmin = indexadmin;
    }
    
    public void setIndexadmin() {
        System.out.println("ini overload");
    }

    @Override
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    } 
}