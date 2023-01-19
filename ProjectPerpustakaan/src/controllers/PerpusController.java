package controllers;

import java.util.ArrayList;
import java.util.Date;

import entity.BukuEntity;
import entity.UserEntity;
import models.PerpusModel;
import models.UserModel;

public class PerpusController {

    public ArrayList<BukuEntity> getBukuList() {
        return PerpusModel.getBukuList();
    }

    public void addBuku(String judul, String penulis,
            String penerbit, int jumlahHalaman, String tahunTerbit) {
        BukuEntity newBuku = new BukuEntity(0, judul, penulis, penerbit, jumlahHalaman, tahunTerbit);

        PerpusModel.tambahBuku(newBuku);
    }

    public BukuEntity findBukubyId(int idBuku) {
        return PerpusModel.findBukubyId(idBuku);
    }

    public void deleteBuku(BukuEntity buku) {
        PerpusModel.hapusBuku(buku);
    }

    public UserEntity loginUser(String username, String password) {
        return UserModel.login(username, password);
    }

    public boolean registrasiUser(String nama, String noTelp, String alamat,
            Date tanggalLahir, String username, String password) {

        UserEntity userNew = new UserEntity(nama, noTelp, alamat, tanggalLahir, username, password);

        return UserModel.register(userNew);
    }

}
