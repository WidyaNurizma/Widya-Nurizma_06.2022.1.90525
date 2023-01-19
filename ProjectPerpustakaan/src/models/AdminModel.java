package models;

import java.util.Date;
import java.util.ArrayList;

import entity.AdminEntity;
import utils.DateConvert;

public class AdminModel {
    private static ArrayList<AdminEntity> adminList = new ArrayList<>();

    public static void initData() {
        Date date = DateConvert.toDate("01/01/2000");
        AdminEntity admin1 = new AdminEntity("test admin", "081", "Jl. ", date, "123456", "123");

        AdminModel.insertAdmin(admin1);
    }

    public static void insertAdmin(AdminEntity adminNew) {
        adminList.add(adminNew);
    }

    public static AdminEntity login(String nik, String password) {
        for (AdminEntity adminEntity : adminList) {
            if ((adminEntity.getNik().equals(nik)) && (adminEntity.getPassword().equals(password))) {
                return adminEntity;
            }
        }
        return null;
    }
}
