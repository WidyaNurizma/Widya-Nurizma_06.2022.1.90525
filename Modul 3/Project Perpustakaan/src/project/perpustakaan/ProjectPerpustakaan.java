package project.perpustakaan;
import java.util.*;

public class ProjectPerpustakaan {
    static Scanner DB = new Scanner(System.in);
    static int KodeBuku;
    static String NamaBuku;
    static String Pengarang;
    static String Penerbit;
    static int Tahun;

    public ProjectPerpustakaan(){
        KodeBuku = 90525;
        NamaBuku = "PBO";
        Pengarang = "Widya";
        Penerbit = "Nurizma";
        Tahun = 2022;
    }
    
    public ProjectPerpustakaan(int KodeBuku, String NamaBuku, String Pengarang, String Penerbit, int Tahun){
        this.KodeBuku = KodeBuku;
        this.NamaBuku = NamaBuku;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }
            
    public static void main(String[] args) {
        System.out.print("KodeBuku :");
        KodeBuku = DB.nextInt();
        System.out.print("NamaBuku :");
        NamaBuku = DB.next();
        System.out.print("Pengarang :");
        Pengarang = DB.next();
        System.out.print("Penerbit :");
        Penerbit = DB.next();
        System.out.print("Tahun :");
        Tahun = DB.nextInt();
        
        System.out.println("=====================");
        System.out.println("==== DAFTAR BUKU ====");
        System.out.println("Kode Buku :" +KodeBuku);
        System.out.println("NamaBuku :" +NamaBuku);
        System.out.println("Pengarang :" +Pengarang);
        System.out.println("Penerbit :" +Penerbit);
        System.out.println("Tahun :" +Tahun);
        
    }   
}