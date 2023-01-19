package private_access;

public class privatclass {
    private int umur;
    private String nama;
    
    public privatclass(int umur, String nama){
        this.umur = umur;
        this.nama = nama;
    }
    
    public void cetak(){
        System.out.println("nama :" + this.nama);
        System.out.println("umur :" + this.umur);
    }
}