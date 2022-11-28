/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa1;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa1 {
    String namaLengkap;
    String npm;
    char kelamin;
    int semester;
 
 
    public Mahasiswa1(String namaLengkap, String npm, char kelamin, int semester){
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.kelamin = kelamin;
        this.semester = semester;
    }
    void output(){
        System.out.println(this.namaLengkap +" | "+this.npm+" | "+this.kelamin+" | "+this.semester);
    }
 
    public static void main(String[] args) {
        Mahasiswa1 mhs = new Mahasiswa1("Ayu ","01 ",'P', 1);
        mhs.output();
        Mahasiswa1 mhs1 = new Mahasiswa1("Permata ","02 ",'P', 2);
        mhs1.output();
        Mahasiswa1 mhs2 = new Mahasiswa1("Widya ","03 ",'P', 3);
        mhs2.output();
        Mahasiswa1 mhs3 = new Mahasiswa1("Nur ","04 ",'P', 4);
        mhs3.output();
        Mahasiswa1 mhs4 = new Mahasiswa1("Rizma ","05 ",'P', 5);
        mhs4.output();
    } 
}