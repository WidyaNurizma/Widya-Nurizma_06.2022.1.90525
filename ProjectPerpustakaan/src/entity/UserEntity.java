package entity;

import java.util.Date;

public class UserEntity extends Identitas {
    private String username;
    private String password;

    public UserEntity(String nama, String notelp, String alamat, Date tglLahir, String username, String password) {
        super(nama, notelp, alamat, tglLahir);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
