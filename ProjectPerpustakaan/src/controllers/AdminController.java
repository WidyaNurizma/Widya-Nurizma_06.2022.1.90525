package controllers;

import entity.AdminEntity;
import models.AdminModel;

public class AdminController {

    public boolean login(String username, String password) {
        AdminEntity adminCheck = AdminModel.login(username, password);

        if (adminCheck != null) {
            // Login Sukses
            return true;
        }

        return false;
    }

}
