package cobaa1;

public class COBAA1 {
    public String username;
    public String password;
    
    public COBAA1(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class Main {
    public static void Main(String[] args) {
       COBAA1 apk = new COBAA1("Widya Nurizma", "12345");
       System.out.println("username :" + apk.username);
       System.out.println("password :" + apk.password);
    }
}