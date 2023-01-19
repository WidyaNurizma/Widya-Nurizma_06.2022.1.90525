package Model;
import Entity.AdminEntity;
import Entity.DaftarEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AdminModel implements ModelInterface{
    private ArrayList<AdminEntity> adminEntityArrayList;
    
    public AdminModel() {
        adminEntityArrayList = new ArrayList<AdminEntity>();
    }
    
    public void insertAdmin(AdminEntity admin) {
        adminEntityArrayList.add(admin);
    }
    
    @Override
    public void view(){
        for (AdminEntity adminEntity : adminEntityArrayList){
            System.out.println(adminEntity.getNama());
            System.out.println(adminEntity.getPassword());
            System.out.println(adminEntity.getNotelp());
            System.out.println(adminEntity.getAlamat());
            System.out.println(new SimpleDateFormat("dd-MM-yyy").format(adminEntity.getTglLahir()));
        }
    }
    
    @Override
    public int cekData(String nama, String password){
        int index = 0;
        for (AdminEntity adminEntity : adminEntityArrayList){
            if (adminEntity.getNama().equals(nama) && (adminEntity.getPassword().equals(password))){
                break;
            } else{
                index++;
            }
        }
        return index;
    }
    
    public AdminEntity showDataAdmin(int index){
        return adminEntityArrayList.get(index);
    }

}
