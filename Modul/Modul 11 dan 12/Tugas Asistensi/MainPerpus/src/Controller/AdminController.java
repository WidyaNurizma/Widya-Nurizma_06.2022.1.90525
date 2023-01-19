package Controller;
import Entity.AdminEntity;
import Entity.DaftarEntity;
import Entity.UserPerpusEntity;
import Entity.BukuEntity;
import java.util.Date;
import java.util.ArrayList;

public class AdminController implements ControllerInterface{
    int indexLogin = 0;
    public AdminController() {    
    }
    
    public void dataAdmin() {
        String namaAdmin[] = {"Ayu","Permata","Widya","Nur","Rizma"};
        String passwordAdmin[] = {"01","02","03","04","05"};
        String notelpAdmin[] = {"123","456","789","321","654"};
        String alamatAdmin[] = {"tulungagung","trenggalek","gresik","surabaya","bandung"};
        String tglLahirAdmin[] = {"01/08/2022","02/08/2022","03/08/2022","04/08/2022","05/08/2022"};
        String buku[] = {"PBO", "SO", "Jarkom", "Basis Data"};
        for(int i = 0; i < namaAdmin.length; i++) {
            AllObjectModel.adminModel.insertAdmin(new AdminEntity(namaAdmin[i], passwordAdmin[i], 
                    notelpAdmin[i],  alamatAdmin[i], new Date(tglLahirAdmin[i])));
        }
    }
    
    public void viewAdmin() {
        AllObjectModel.adminModel.view();
    }
    
    public void listPendaftarUser(){
        AllObjectModel.daftarModel.view();
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel.adminModel.cekData(nama, password);
    }

    public AdminEntity adminEntity() {
        return AllObjectModel.adminModel.showDataAdmin(indexLogin);
    }
    
    public void updateIsVerified(int index, int indexUser, UserPerpusEntity UserPerpusEntity) {
        AllObjectModel.daftarModel.updateIsVerified(index, new DaftarEntity(UserPerpusEntity, true, indexUser));
    }

    public ArrayList<DaftarEntity>cekDaftarModel(){
return AllObjectModel.daftarModel.getDaftaruserArrayList();
}
  
}