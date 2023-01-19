package kucing;

public abstract class Kucing {
    public abstract int jumlahKaki();
    public abstract String warna();
    public abstract boolean isBerbulu();
    
    public void tampil(){
        System.out.println("Jumlah Kaki :" + this.jumlahKaki());
        System.out.println("Apakah Berbulu :" + this.isBerbulu());
        System.out.println("Warna :" + this.warna());
    }
    

        public static void main(String[] args){
            Anggora anggora = new Anggora();
            anggora.tampil();
            
            System.out.println("==============");
            
            Persia persia = new Persia();
            persia.tampil();
            
        }
    }
