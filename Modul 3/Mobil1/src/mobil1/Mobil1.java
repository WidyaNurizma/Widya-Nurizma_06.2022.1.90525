/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil1;

/**
 *
 * @author Lenovo
 */
public class Mobil1 {
    String warna;
    int jmRoda = 4;
    int cc;
 
    public Mobil1(){
        warna = "Hitam";
    }
 
    public static void main(String[] args) {
        Mobil1 mobil = new Mobil1();
        System.out.println(mobil.warna);
        System.out.println(mobil.jmRoda);
        System.out.println(mobil.cc);
    }
}