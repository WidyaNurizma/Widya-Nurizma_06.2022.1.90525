package accessmodifier;
import private_access.*;
import protected_access.*;
import private_access.privatclass;
import protected_access.protectedclass;

public class AccessModifier {

    public static void main(String[] args) {
        privatclass privat = new privatclass(21,"Widya");
        privat.cetak();
        
        protectedclass protectedclas = new protectedclass(3,"Surabaya");
        protectedclas.cetak();
    }
}
