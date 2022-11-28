package pboperpustakaan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Perpustakaan2 {
    static ArrayList<PBOPerpustakaan>dataPerpustakaan1 = new ArrayList();
    static ArrayList<Perpustakaan3>dataPerpustakaan2 = new ArrayList();
    static Scanner input = new Scanner(System.in);
    private static int indexperpustakaan;
    
    public static void main(String[] args){
        System.out.println("Daftar Buku");
        int pil;
        Daftarbuku();
        do{
            System.out.println("1.Daftar Buku");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Pilih =");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    Daftarbuku();
                    break;
                case 2:
                    System.out.println("Npm =");
                    String Npm = input.next();
                    System.out.println("Password =");
                    String Pass = input.next();
                    view(Npm, Pass);
                    break;
            }
        } while(pil!= 3);
    }
    static void Daftarbuku(){
        System.out.println("input Npm =");
        String Npm = input.next();
        System.out.println("input Nama =");
        String Nama = input.next();
        System.out.println("input Password =");
        String Pass = input.next();
        System.out.println("input Kode Buku =");
        String KodeBuku = input.next();
        System.out.println("input Pengarang =");
        String Pengarang = input.next();
        System.out.println("input Penerbit =");
        String Penerbit = input.next();
        System.out.println("input Tanggal Terbit (mm/dd/yyyy)=");
        String TanggalTerbit = input.next();
        System.out.println("Jenis Buku =");
        String JenisBuku = input.next();
        for(int i=0; i<dataPerpustakaan1.size();i++){
            System.out.println(i+"."+dataPerpustakaan1.get(i).Nama);
        }
        System.out.println("Pilih Jenis Buku =");
        int indexperpustakaan = input.nextInt();
        for(int i=0;1<Perpustakaan4.JenisBuku.length;i++){
         System.out.println(i+"."+Perpustakaan4.JenisBuku[i]);   
        }
        System.out.println("Pilih Daftar Buku =");
        int indexdaftarbuku = input.nextInt();
        dataPerpustakaan2.add(new Perpustakaan3(Npm, Nama, Password, KodeBuku, Pengarang, Penerbit, TanggalTerbit, indexperpustakaan, indexdaftarbuku));
    }
    
    static void view(String Npm, String Password){
        for(int i = 0;i<dataPerpustakaan2.size();i++){
            if(Npm.equals(dataPerpustakaan2.get(i).getNpm())&&Password.equals(dataPerpustakaan2.get(i).getClass().Password())){
                System.out.println("Npm =" +dataPerpustakaan2.get(i).getNpm());
                System.out.println("Nama =" +dataPerpustakaan2.get(i).getNama());
                System.out.println("Kode Buku =" +dataPerpustakaan2.get(i).getKodeBuku());
                System.out.println("Pengarang =" +dataPerpustakaan2.get(i).getPengarang());
                System.out.println("Penerbit =" +dataPerpustakaan2.get(i).getPenerbit());
                System.out.println("Tanggal Terbit =" +dataPerpustakaan2.get(i).getTanggalTerbit());
            } else{
                System.out.println("Npm, Nama atau Password Salah");
            }
        }
    }
    static void DaftarBuku(){
        String NpmPerpustakaan[] = {"01","02","03","04"};
        String PasswordPerpustakaan[] = {"01","02","03","04"};
        String NamaBuku[] = {"PBO","SO","JARKOM","Struktur Data"};
        String TanggalTerbitPerpustakaan[] = {"01/08/2022","02/08/2022","03/08/2022","04/08/2022","05/08/2022"};
        for(int i=0;i<NpmPerpustakaan.length;i++){
            daftarbuku.add(new Perpustakaan2(NpmPerpustakaan[i],NamaBuku[i],Password[i],new (TanggalTerbit[i])));
        }
    }
}
