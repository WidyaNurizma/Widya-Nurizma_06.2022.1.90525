package kampus;

public class Dosen {
    private String nama;
    private int nip;
    
    public Dosen(String nama, int nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public void viewdsn(){
        System.out.println("Nama Dosen :" +this.nama);
        System.out.println("NIP :" +this.nip);
    }
}
