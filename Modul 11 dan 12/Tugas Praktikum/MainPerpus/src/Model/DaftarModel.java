package Model;
import Entity.DaftarEntity;
import Entity.BukuEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarModel {
    private ArrayList<DaftarEntity> daftaruserArrayList;
    public DaftarModel(){
        daftaruserArrayList = new ArrayList<DaftarEntity>();
    }
    public void insertDataDaftaruser(DaftarEntity daftaruser){
        daftaruserArrayList.add(daftaruser);
    }
    public ArrayList<DaftarEntity> getDaftaruserArrayList(){
        return daftaruserArrayList;
    }
    public ArrayList<DaftarEntity>alldatauser(){
        return daftaruserArrayList;
    }
    
    public void view(){
        for(DaftarEntity daftaruser : daftaruserArrayList){
            System.out.println("===================================");
            System.out.println(" Nama : "+daftaruser.getuser().getNama()+"\n Password : "+daftaruser
                    .getuser().getPassword()+"\n No.Telp : "+daftaruser.getuser().getNotelp()+"\n Alamat : "+daftaruser.getuser().getAlamat()+"\n Tanggal Lahir : "+new SimpleDateFormat
        ("dd-MM-yyyy").format(daftaruser.getuser().getTglLahir())+"\n Buku : "+BukuEntity.Buku[daftaruser.getIndexUser()]+"\n isVerified : ");
            if (daftaruser.isVerified() == false){
                System.out.println("Belum Di Verifikasi Admin");
            }else{
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("====================================");
        }
    }
    
    public int cekData(String nama, String password){
        int loop = 0;
        if(daftaruserArrayList.size()==0){
            loop = -1;
        }else{
        for(int i=0;i<daftaruserArrayList.size();i++){
            if(daftaruserArrayList.get(i).getuser().getNama().equals(nama)){
                loop = i;
                break;
            }else{
                loop = -2;
            }
            }
        }
        return loop;
    }
    public DaftarEntity showDaftaruser(int index){
        return daftaruserArrayList.get(index);
    }
    public void updateIsVerified(int index, DaftarEntity daftarEntity){
        daftaruserArrayList.set(index, daftarEntity);
    }
}