package pboperpustakaan;
import java.util.*;

public class PBOPerpustakaan {
    static Scanner DB = new Scanner(System.in);
    static int KodeBuku;
    static String Npm;
    static String Password;
    static String Nama;
    static String NamaBuku;
    static String Pengarang;
    static String Penerbit;
    static String TanggalTerbit;
    int indexperpustakaan;
    int indexdaftarbuku;
    static String JenisBuku;
    
    public PBOPerpustakaan(int KodeBuku,String Password, String Nama, String NamaBuku, String Pengarang, String Penerbit, String TanggalTerbit,  int indexperpustakaan,
    int indexdaftarbuku, String JenisBuku){
        this.KodeBuku = KodeBuku;
        this.Password = Password;
        this.Nama = Nama;
        this.NamaBuku = NamaBuku;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.TanggalTerbit = TanggalTerbit;
        this.indexdaftarbuku = indexdaftarbuku;
        this.indexperpustakaan = indexperpustakaan;
        this.JenisBuku = JenisBuku;
    }
    public int getKodeBuku(){
        return KodeBuku;
    }
    public String Npm(){
        return Npm;
    }
    public String Password(){
        return Password;
    }
    public String Nama(){
        return Nama;
    }
    public String NamaBuku(){
        return NamaBuku;
    }
    public String Pengarang(){
        return Pengarang;
    }
    public String Penerbit(){
        return Penerbit;
    }
    public String TanggalTerbit(){
        return TanggalTerbit;
    }
}
