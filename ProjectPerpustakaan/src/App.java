import models.AdminModel;
import models.PerpusModel;
import models.UserModel;
import views.LoginUserGui;

public class App {
    public static void main(String[] args) {
        PerpusModel.initDataBuku();
        AdminModel.initData();
        UserModel.initData();

        new LoginUserGui().setVisible(true);
    }
}