/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil2;

/**
 *
 * @author Lenovo
 */
public class Mobil2 {
    String warna;
    int jmRoda = 4;
 
    public Mobil2(String warnaAwal, int jmRoda){
        this.jmRoda = jmRoda;
        warna = warnaAwal;
    }
 
    public static void main(String[] args) {
        Mobil2 mobil = new Mobil2("Hitam", 4);
        System.out.println(mobil.warna);
        System.out.println(mobil.jmRoda);
    }
}