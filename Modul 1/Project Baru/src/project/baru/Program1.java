/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.baru;

/**
 *
 * @author Lenovo
 */
public class Program1 {
    static String nama = "Ayu Permata Widya Nurizma";
    static int tahunSkrg = 2022, tahunLhr = 2001;
    static int umur;
    static double ipk;
 
    //penggunaan method static
    static int umur(){
        umur = tahunSkrg - tahunLhr;
        return umur;
        // TODO code application logic here
    }
    static double ipk(){
        ipk = 4.00;
        return ipk;
    }   
}