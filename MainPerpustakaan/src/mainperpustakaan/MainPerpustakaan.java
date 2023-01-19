package mainperpustakaan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class MainPerpustakaan {

    /**
     * @param args the command line arguments
     */
    static ArrayList<AdminEntity> dataAdmin = new ArrayList();
    static ArrayList<UserPerpusEntity> dataUser = new ArrayList();
    static Scanner input = new Scanner(System.in);
    private static int indexadmin;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Selamat Datang Di Perpustakaan");
        int pil;
        dataAdmin();
        do{
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Pilih =");
            pil = input.nextInt();
            switch (pil){
                case 1:
                    daftar();
                    break;
                case 2:
                    System.out.print("Nama = ");
                    String nama = input.next();
                    System.out.print("Password = ");
                    String password = input.next();
                    view(nama, password);
                    break;
            }
        }while (pil != 3);
    }
    
    static void daftar(){
        System.out.print("input Nama =");
        String nama = input.next();
        System.out.print("input Password =");
        String password = input.next();
        System.out.print("input Notelp =");
        String notelp = input.next();
        System.out.print("input Alamat =");
        String alamat = input.next();
        System.out.print("input TglLahir =");
        Date tglLahir = new Date(input.next());
        for(int i = 0; i< dataAdmin.size(); i++){
            System.out.println(i+"."+ dataAdmin.get(i).nama);
        }
        System.out.print("Pilih Admin =");
        int indexadmin = input.nextInt();
        for(int i = 0; i < BukuEntity.Buku.length; i++){
            System.out.println(i + "." + BukuEntity.Buku[i]);
        }
        System.out.print("Pilih Buku =");
        int indexbuku = input.nextInt();
        dataUser.add(new UserPerpusEntity(nama, password, notelp, alamat, tglLahir, indexbuku, indexadmin));
    }
     static void view(String nama, String password){
         for (int i = 0; i < dataUser.size(); i++) {
            if (nama.equals(dataUser.get(i).getNama()) && password.equals(dataUser.get(i).getPassword())) {
                System.out.println("Nama          = " + dataUser.get(i).getNama());
                System.out.println("Alamat        = " + dataUser.get(i).getAlamat());
                System.out.println("Tanggal Lahir = " + new SimpleDateFormat("dd-MM-yyyy").format(dataUser.get(i).getTglLahir()));
                System.out.println("No Telp       = " + dataUser.get(i).getNotelp());
                System.out.println("Nama Admin    = " + dataAdmin.get(dataUser.get(i).indexadmin).getNama());
                System.out.println("Buku          = " + BukuEntity.Buku[dataUser.get(i).indexbuku]);
                
            } else {
                System.out.println("Nama atau Password Salah");
            }
        }
     }


    private static void dataAdmin() {
        String namaAdmin[] = {"Ayu","Permata","Widya","Nur","Rizma"};
        String passwordAdmin[] = {"01","02","03","04","05"};
        String notelpAdmin[] = {"123","456","789","321","654"};
        String alamatAdmin[] = {"tulungagung","trenggalek","gresik","surabaya","bandung"};
        String tglLahirAdmin[] = {"01/08/2022","02/08/2022","03/08/2022","04/08/2022","05/08/2022"};
        for(int i = 0; i < namaAdmin.length; i++){
            dataAdmin.add(new AdminEntity(namaAdmin[i],passwordAdmin[i],notelpAdmin[i],alamatAdmin[i],new Date(tglLahirAdmin[i])));
        }
    }
    
}
