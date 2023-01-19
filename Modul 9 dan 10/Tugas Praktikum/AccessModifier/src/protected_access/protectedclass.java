package protected_access;

public class protectedclass {
    protected int semester;
    protected String tempatTinggal;
    
    public protectedclass(int semester, String tempaTinggal){
        this.semester= semester;
        this.tempatTinggal = tempatTinggal;
    }
    
    public void cetak(){
        System.out.println("Semester :" + this.semester);
        System.out.println("Tempat Tinggal :" + this.tempatTinggal);
    }   
}