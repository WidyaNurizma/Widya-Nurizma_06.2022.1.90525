package buku;

public class Buku2 extends Buku{
    
    public Buku2(String nama){
        this.nama = nama;
    }
    
    @Override
    public void membaca(){
        System.out.println("Membaca PBO 3");
    }
    
    @Override
    public void menulis(){
        System.out.println("Menulis PBO 3");
    }
    
}
