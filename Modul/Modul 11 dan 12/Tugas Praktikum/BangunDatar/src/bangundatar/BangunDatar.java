package bangundatar;

public class BangunDatar {
    
    public double luas(double r){ // lingkaran
        return 3.14*r*r;
    } 
    
    public double luas(double a, double t){ //segitiga
        return 0.5*a*t;
    }
    
    public int luas(int s){ //persegi
        return s*s*s;
    }
    
    public int luas(int p, int l){//persegi panjang
        return p*l;
    }
    
    public static void main(String[] args) {
        BangunDatar bgndatar = new BangunDatar();
        System.out.println("Luas lingkaran :" + bgndatar.luas(7.0));
        System.out.println("Luas persegi :" + bgndatar.luas(4));
        System.out.println("Luas segitiga :" + bgndatar.luas(3.0,6));
        System.out.println("Luas persegi panjang :" + bgndatar.luas(4, 6));
    }
    
}