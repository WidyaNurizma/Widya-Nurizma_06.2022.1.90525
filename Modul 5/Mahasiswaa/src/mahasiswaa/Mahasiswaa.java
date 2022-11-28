/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswaa;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
 
public class Mahasiswaa{
    String nama;
    int npm;
 
    public Mahasiswaa(String nama, int npm) {
        this.nama = nama;
        this.npm = npm;
    }
 
    public static void main(String[] args) {
        List<String> mhs = new ArrayList<>();
 
        mhs.add("Ayu");
        mhs.add("Widya");
        mhs.add("Nurizma");
 
        List<Integer>npm = new ArrayList<>();
 
        npm.add(3);
        npm.add(5);
        npm.add(7);
 
        System.out.println(mhs.get(0));
        System.out.println(mhs.get(1));
        System.out.println(mhs.get(2));
 
        System.out.println(npm.get(0));
        System.out.println(npm.get(1));
        System.out.println(npm.get(2));
 
        for(int i = 0; i< mhs.size(); i++){
            System.out.println(mhs.get(i));
        }
 
        for(Integer data: npm){
            System.out.println(data);
        }
        }
    }
