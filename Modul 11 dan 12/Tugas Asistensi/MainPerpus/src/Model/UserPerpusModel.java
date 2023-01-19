package Model;
import Entity.UserPerpusEntity;
import java.util.ArrayList;

public class UserPerpusModel implements ModelInterface{
     private ArrayList<UserPerpusEntity> userperpusEntityArrayList;

    public UserPerpusModel(){
        userperpusEntityArrayList = new ArrayList<UserPerpusEntity>();
    }
    
    public void insert(UserPerpusEntity userperpusEntity){
//        System.out.println("masuk");
        userperpusEntityArrayList.add(userperpusEntity);
//        System.out.println("keluar");
    }
    
     @Override
    public void view(){
        for(UserPerpusEntity userperpusEntity : userperpusEntityArrayList){
            System.out.println("=======================");
            System.out.println
                    ("Nama : "+userperpusEntity.getNama()+
                    "\n Password : "+userperpusEntity.getPassword()+
                    "\n No.Telp : "+userperpusEntity.getNotelp()+
                    "\n Alamat : "+userperpusEntity.getAlamat()+
                    "\n Tanggal Lahir :"+userperpusEntity.getTglLahir());
            System.out.println("==============================================");
        }
    }
    
    @Override
     public int cekData(String nama, String password){
        int index = -1;
        for(UserPerpusEntity userPerpusEntity : userperpusEntityArrayList){
            if((!userPerpusEntity.getNama().equals(nama)) &&
                    (!userPerpusEntity.getPassword().equals(password))){
                index++;
        }
    }
    return index;
    
     }    
     
      public UserPerpusEntity getUserPerpusEntityArrayList(int index){
        return userperpusEntityArrayList.get(index);
    }
}