package kalkulator;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.println("Input Operasi: ");
        String angkaStr = input.nextLine();
        
        String[] inputUser = angkaStr.split(" ");
        
        int angka1 = Integer.parseInt(inputUser[0]);
        String operator = inputUser[1];
        int angka2 = Integer.parseInt(inputUser[2]);
        
        switch(operator){
            case "+":
                int hasil = angka1 + angka2;
                System.out.println("Hasil " + hasil);
                
                // case ...
        }
        }catch(NumberFormatException e){
                System.out.println("Konversi salah");
                }
        } 
}