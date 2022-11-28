package buku;

public class PBO extends Buku{
    
    @Override
    public void membaca(){
        System.out.println("Membaca PBO 1");
    }
    
    @Override
    public void menulis(){
        System.out.println("Menulis PBO 1");
    }
    
    //Method Overload
    public void menulis(String menulis){
        System.out.println(menulis);
    }
}