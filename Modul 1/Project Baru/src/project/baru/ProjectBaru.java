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
public class ProjectBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Program1 prog = new Program1();
        System.out.println("Nama Saya :" +prog.nama);
        System.out.println("Saya:" +prog.umur() + "Tahun");
        System.out.println("IPK Saya:" +prog.ipk());
        // TODO code application logic here
    }
}