/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucing;

/**
 *
 * @author Lenovo
 */
public class Kucing {
    String jenisKucing;
    int umur;
 
public Kucing(){
    jenisKucing = "Orange";
    umur = 1; 
}
 
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
 
        System.out.println(kucing.jenisKucing);
        System.out.println(kucing.umur);
    }
}