package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.PerpusController;
import entity.UserEntity;

import java.awt.Color;
import java.awt.Font;

public class LoginUserGui extends MainFrame {
    private JLabel perpusLabel;
    private JLabel loginLabel;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton registrasiBtn;
    private JButton loginAdminBtn;
    private JLabel imageLogin;

    public LoginUserGui() {
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

        loginLabel = new JLabel("LOGIN USER");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        boundedAdd(loginLabel, 95, 300, 200, 30);

        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(usernameLabel, 65, 350, 100, 18);

        usernameField = new JTextField();
        boundedAdd(usernameField, 65, 370, 270, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(passwordLabel, 65, 415, 65, 18);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 65, 435, 270, 30);

        loginBtn = new JButton("Masuk");
        loginBtn.setForeground(Color.white);
        loginBtn.setBackground(color("#2596be"));
        loginBtn.setFocusPainted(false);
        boundedAdd(loginBtn, 157, 480, 85, 30);

        registrasiBtn = new JButton("Registrasi");
        registrasiBtn.setForeground(color("#2596be"));
        registrasiBtn.setBackground(color("#EEEEEE"));
        registrasiBtn.setBorderPainted(false);
        registrasiBtn.setFocusPainted(false);
        boundedAdd(registrasiBtn, 75, 525, 100, 30);

        loginAdminBtn = new JButton("Login Admin");
        loginAdminBtn.setForeground(color("#2596be"));
        loginAdminBtn.setBackground(color("#EEEEEE"));
        loginAdminBtn.setBorderPainted(false);
        loginAdminBtn.setFocusPainted(false);
        boundedAdd(loginAdminBtn, 225, 525, 100, 30);
    }

    @Override
    protected void event() {

        loginBtn.addActionListener((e) -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            PerpusController perpusC_ = new PerpusController();

            UserEntity user = perpusC_.loginUser(username, password);

            if (user != null) {
                new DashboardUserGui().setVisible(true);
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password Salah", "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });

        loginAdminBtn.addActionListener((e) -> {
            new LoginAdminGui().setVisible(true);

            dispose();
        });

        registrasiBtn.addActionListener((e) -> {
            new RegistrasiUserGui().setVisible(true);

            // dispose();
        });
    }

}
