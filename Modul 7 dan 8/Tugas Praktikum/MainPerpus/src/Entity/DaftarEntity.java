package Entity;

public class DaftarEntity {
    private UserPerpusEntity user;
    private boolean isVerified;
    private int IndexUser;

    public DaftarEntity(UserPerpusEntity user, boolean isVerified, int IndexUser) {
        this.user = user;
        this.isVerified = isVerified;
        this.IndexUser = IndexUser;
    }

    public DaftarEntity(BukuEntity BukuEntity, boolean verified, int indexUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserPerpusEntity getuser() {
        return user;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexUser() {
        return IndexUser;
    }

    public void setIndexUser(int IndexUser) {
        this.IndexUser = IndexUser;
    }
}