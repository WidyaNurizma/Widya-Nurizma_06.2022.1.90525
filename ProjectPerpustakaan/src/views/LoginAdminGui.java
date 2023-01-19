package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.AdminController;

import java.awt.Color;
import java.awt.Font;

public class LoginAdminGui extends MainFrame {
    private JLabel perpusLabel;
    private JLabel loginLabel;
    private JLabel nikLabel, passwordLabel;
    private JTextField nikField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton loginUserBtn;
    private JLabel imageLogin;

    public LoginAdminGui() {
        super("LOGIN", 400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    protected void component() {

        imageLogin = new JLabel(loadImage("src/images/login.png", 200, 200));
        boundedAdd(imageLogin, 100, 62, 200, 200);

        perpusLabel = new JLabel("PERPUSTAKAAN");
        perpusLabel.setFont(new Font("Arial", Font.BOLD, 24));
        perpusLabel.setForeground(color("#2596be"));
        boundedAdd(perpusLabel, 100, 265, 200, 45);

        loginLabel = new JLabel("LOGIN ADMIN");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        boundedAdd(loginLabel, 95, 300, 200, 30);

        nikLabel = new JLabel("NIK");
        nikLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(nikLabel, 65, 350, 100, 18);

        nikField = new JTextField();
        boundedAdd(nikField, 65, 370, 270, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(passwordLabel, 65, 415, 65, 18);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 65, 435, 270, 30);
        loginBtn = new JButton("Masuk");
        loginBtn.setForeground(Color.white);
        loginBtn.setBackground(color("#2596be"));
        loginBtn.setFocusPainted(false);
        boundedAdd(loginBtn, 157, 485, 85, 30);

        loginUserBtn = new JButton("Login User");
        loginUserBtn.setForeground(color("#2596be"));
        loginUserBtn.setBackground(color("#EEEEEE"));
        loginUserBtn.setBorderPainted(false);
        loginUserBtn.setFocusPainted(false);
        boundedAdd(loginUserBtn, 150, 525, 100, 30);
    }

    @Override
    protected void event() {
        loginBtn.addActionListener((e) -> {
            String nik = nikField.getText();
            String password = String.valueOf(passwordField.getPassword());

            AdminController adminC_ = new AdminController();

            boolean status = adminC_.login(nik, password);

            if (status == true) {
                new DashboardAdminGui().setVisible(true);

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "NIK atau Password Salah", "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        loginUserBtn.addActionListener((e) -> {
            new LoginUserGui().setVisible(true);

            dispose();
        });
    }

}
