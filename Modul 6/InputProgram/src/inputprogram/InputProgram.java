package inputprogram;
import java.util.Scanner;

public class InputProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan angka :");
        int num = input.nextInt();
        input.nextLine();
        
        System.out.println("Masukan kata :");
        String kata = input.nextLine();
        System.out.println("angkat = " + num);
        System.out.println("kata = " + kata);
    }
    
}
