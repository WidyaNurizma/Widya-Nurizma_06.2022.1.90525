package buku;

public class mainBuku {
    
        
    public static void main(String[] args){
        PBO pbo = new PBO();
        pbo.nama = "Widya";
        pbo.kode = 90525;
        
        pbo.membaca();
        pbo.menulis();
        System.out.println("--------------------");
        
        Buku Buku1 = new Buku1("PBO 2");
        
        Buku1.membaca();
        Buku1.menulis();
        System.out.println("--------------------");
        
        Buku Buku2 = new Buku2("PBO 3");
        
        Buku2.membaca();
        Buku2.menulis();
    }
}
