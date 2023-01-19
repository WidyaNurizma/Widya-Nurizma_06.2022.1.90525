package models;

import java.util.ArrayList;

import entity.BukuEntity;

public class PerpusModel {
    private static ArrayList<BukuEntity> bukuList = new ArrayList<>();

    public static ArrayList<BukuEntity> getBukuList() {
        return bukuList;
    }

    public static void initDataBuku() {
        BukuEntity buku1 = new BukuEntity(0, "Buku 1", "Penulis 1", "Penerbit 1", 100, "10/10/2020");
        BukuEntity buku2 = new BukuEntity(0, "Buku 2", "Penulis 2", "Penerbit 2", 120, "09/09/2020");

        tambahBuku(buku1);
        tambahBuku(buku2);
    }

    private static int getLastId() {
        if (bukuList.size() > 0) {
            int lastIndex = bukuList.size() - 1;
            BukuEntity bukuLast = bukuList.get(lastIndex);
            return bukuLast.getId();
        } else {
            return 0;
        }
    }

    public static void tambahBuku(BukuEntity buku) {
        int newId = getLastId() + 1;
        buku.setId(newId);

        bukuList.add(buku);
    }

    public static BukuEntity findBukubyId(int id) {
        for (BukuEntity bukuEntity : bukuList) {
            if (bukuEntity.getId() == id) {
                return bukuEntity;
            }
        }

        return null;
    }

    public static void hapusBuku(BukuEntity buku) {
        bukuList.remove(buku);
    }

}
