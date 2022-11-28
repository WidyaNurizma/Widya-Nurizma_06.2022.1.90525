package buku;

public class Buku1 extends Buku{
    
    public Buku1(String nama){
        this.nama = nama;
    }
    
    @Override
    public void membaca(){
        System.out.println("Membaca PBO 2");
    }
    
    @Override
    public void menulis(){
        System.out.println("Menulis PBO 2");
    }   
}