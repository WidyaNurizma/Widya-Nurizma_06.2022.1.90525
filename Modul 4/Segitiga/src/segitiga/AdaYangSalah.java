/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author Lenovo
 */
public class AdaYangSalah {

        public static void main(String[] args){
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 12;
 
        double luas = segitiga.luas();
        System.out.println("Luas: "+ luas);
    }
}
