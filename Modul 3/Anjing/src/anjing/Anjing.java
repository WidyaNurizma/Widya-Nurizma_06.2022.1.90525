/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anjing;

/**
 *
 * @author Lenovo
 */
public class Anjing {
    String jenisAnjing;
    int umur;
 
public Anjing(String jenisAjg, int umur){
    this.umur = umur;
    jenisAnjing = jenisAjg;
 
}
    public static void main(String[] args) {
        Anjing ajg = new Anjing("Putih", 1);
        System.out.println(ajg.jenisAnjing);
        System.out.println(ajg.umur);
    }
}