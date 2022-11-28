package pboperpustakaan;
import java.util.*;

public class Perpustakaan3 {
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
    
    public Perpustakaan3(int KodeBuku,String Password, String Nama, String NamaBuku, String Pengarang, String Penerbit, String TanggalTerbit,  int indexperpustakaan,
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
    int getKodeBuku(){
        return this.KodeBuku;
    }
    String getNpm(){
        return this.Npm;
    }
    String getPassword(){
        return this.Password;
    }
    String getNama(){
        return this.Nama;
    }
    String getNamaBuku(){
        return this.NamaBuku;
    }
    String getPengarang(){
        return this.Pengarang;
    }
    String getPenerbit(){
        return this.Penerbit;
    }
    String getTanggalTerbit(){
        return this.TanggalTerbit;
    }
    int getindexperpustakaan(){
        return this.indexperpustakaan;
    }
    int getindexdaftarbuku(){
        return this.indexdaftarbuku;
    }
    String getJenisBuku(){
        return this.JenisBuku;
    }
}
