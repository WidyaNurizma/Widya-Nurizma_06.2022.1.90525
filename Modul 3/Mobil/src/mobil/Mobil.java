/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public class Mobil {
    String warna;
    int jmRoda;
 
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println(mobil.warna);
 
        mobil.warna = "Hitam";
        System.out.println(mobil.warna);
    }   
}