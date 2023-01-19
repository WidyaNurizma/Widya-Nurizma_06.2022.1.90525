package models;

import java.util.ArrayList;
import java.util.Date;

import entity.UserEntity;
import utils.DateConvert;

public class UserModel {
    public static ArrayList<UserEntity> usersList = new ArrayList<>();

    public static void initData() {
        Date date = DateConvert.toDate("01/01/2000");
        UserEntity user1 = new UserEntity("test user", "081", "Jl. ", date, "test", "123");

        register(user1);
    }

    public static boolean register(UserEntity userNew) {
        boolean status = false;
        // Check apakah username telah dipakai oleh User lain
        for (UserEntity userEntity : usersList) {
            if (userEntity.getUsername().equals(userNew.getUsername())) {
                status = true;
                break;
            }
        }

        // Username tersedia (belum ada yang pakai)
        if (status == false) {
            usersList.add(userNew);
            return true;
        } else {
            return false;
        }
    }

    public static UserEntity login(String username, String password) {

        for (UserEntity userEntity : usersList) {
            if ((userEntity.getUsername().equals(username)) &&
                    (userEntity.getPassword().equals(password))) {
                return userEntity;
            }
        }
        return null;
    }

}
