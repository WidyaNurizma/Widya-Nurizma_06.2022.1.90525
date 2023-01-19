package kampus;

public class Mahasiswa {
    private String nama;
    private int npm;
    
    public Mahasiswa(String nama, int npm){
        this.nama = nama;
        this.npm = npm;
    }
    
    public void viewmhs(){
        System.out.println("Nama Mahasiswa :" + this.nama);
        System.out.println("NPM :" + this.npm);
    }
}
