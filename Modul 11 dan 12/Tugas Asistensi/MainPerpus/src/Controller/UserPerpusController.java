package Controller;
import Entity.DaftarEntity;
import Entity.UserPerpusEntity;
import Entity.BukuEntity;
import Model.DaftarModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class UserPerpusController implements ControllerInterface{
   int indexLogin = 0;
    public UserPerpusController() {
    }
    
    public UserPerpusEntity getData() {
        return AllObjectModel.userperpusModel.getUserPerpusEntityArrayList(indexLogin);
    }
    
    public void daftarUser(int indexBuku , UserPerpusEntity UserPerpusEntity , boolean isVerified){
        AllObjectModel.daftarModel.insertDataDaftaruser(new DaftarEntity(UserPerpusEntity, isVerified,indexBuku));
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel.userperpusModel.cekData(nama, password);
    }
    
    public void insert(String password, String nama, String notelp, Date tglLahir, String alamat) {
//        System.out.println("masuk");
        AllObjectModel.userperpusModel.insert(new UserPerpusEntity(password, nama, notelp, tglLahir, alamat));
//        System.out.println("keluar");
    }
    
    public UserPerpusEntity userperpusEntity() {
        return AllObjectModel.userperpusModel.getUserPerpusEntityArrayList(indexLogin);
    }

    public int cekDaftaruser(String nama){
        int cek = AllObjectModel.daftarModel.cekData(nama, null);
        return cek;
    }
    public DaftarEntity showDaftaruser(int index){
        return AllObjectModel.daftarModel.showDaftaruser(index);
    }
    public DefaultTableModel daftaruser(){
        DefaultTableModel dtmdaftaruser = new DefaultTableModel();
        Object[] kolom ={"Nama","Password","No Telp","Tgl Lahir","Alamat","Verified"};
        dtmdaftaruser.setColumnIdentifiers(kolom);
        int size = AllObjectModel.daftarModel.alldatauser().size();
        String verif = null;
        for (int i=0;i<size;i++){
            if(AllObjectModel.daftarModel.alldatauser().get(i).isVerified()==false){
        verif = "no";
    }else{
        verif = "yes";
            }
    Object [] data = new Object[8];
    data[0] = AllObjectModel.daftarModel.alldatauser().get(i).getuser().getNama();
    data[1] = AllObjectModel.daftarModel.alldatauser().get(i).getuser().getPassword();
    data[2] = AllObjectModel.daftarModel.alldatauser().get(i).getuser().getNotelp();
    data[3] = AllObjectModel.daftarModel.alldatauser().get(i).getuser().getAlamat();
    data[4] = AllObjectModel.daftarModel.alldatauser().get(i).getuser().getTglLahir();
    data[5] = new SimpleDateFormat("dd-MM-yyyy").format(AllObjectModel.daftarModel.alldatauser().get(i).getuser().getTglLahir());
    data[6] = BukuEntity.Buku[AllObjectModel.daftarModel.alldatauser().get(i).getIndexUser()];
    data[7] = verif;
    dtmdaftaruser.addRow(data);
        }
    return dtmdaftaruser;
    }

}