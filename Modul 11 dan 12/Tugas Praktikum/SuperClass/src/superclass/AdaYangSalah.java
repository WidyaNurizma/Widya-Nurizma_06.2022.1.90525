package superclass;

public class AdaYangSalah extends SuperClass{
    public static void cetak1(){
        System.out.println("static method subclass");
    }
    
    @Override
    public void cetak2(){
        System.out.println("final method subclass");
    }
    
    @Override
    public void cetak3(){
        System.out.println("method dari subclass");
    }
    
}
