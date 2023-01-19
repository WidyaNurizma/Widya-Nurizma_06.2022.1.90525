package entity;

import java.util.Date;

public class AdminEntity extends Identitas {
    private String nik;
    private String password;

    public AdminEntity(String nama, String notelp, String alamat, Date tglLahir, String nik, String password) {
        super(nama, notelp, alamat, tglLahir);
        this.nik = nik;
        this.password = password;
    }

    public String getNik() {
        return nik;
    }

    public String getPassword() {
        return password;
    }

}
