package coba1;

public class COBA1 {
    public String username;
    public String password;
    
    public COBA1(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class Main{
    public static void main(String[] args) {
        COBA1 apk = new COBA1("Widya Nurizma", "12345");
        System.out.println("username :" + apk.username);
        System.out.println("password :" + apk.password);
        
        apk.username = "wid";
    }
    
}
