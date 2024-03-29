package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class GUI {
    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radiobuku, radiouser;
    JTextField textnamalogin, textnama, textnotelp, texttgllahir, textnamadaftar, textalamat;
    JLabel labelnamalogin, labelnama, labelpasswordlogin, labelnotelp, labeltgllahir, labelnamadaftar, labelpassworddaftar, labelalamat;
    JButton check, reg;
    JPasswordField passwordlogin, passworddaftar;
    private boolean ceklogin = false;

    public GUI() {
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.WHITE);
        top = new JLabel("SELAMAT DATANG DIPERPUS");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);
        radiobuku = new JRadioButton("ADMIN");
        login.setBounds(100, 50, 100, 100);
        radiobuku.setBounds(30, 150, 100, 30);
        radiobuku.setBackground(Color.CYAN);
        LogReg.add(radiobuku);
        radiouser = new JRadioButton("USER");
        radiouser.setBounds(149, 150, 100, 30);
        radiouser.setBackground(Color.CYAN);
        LogReg.add(radiouser);
        labelnamalogin = new JLabel("NAMA");
        labelnamalogin.setBounds(38, 188, 30, 30);
        LogReg.add(labelnamalogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 210, 200, 30);
        LogReg.add(textnamalogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(39, 240, 100, 30);
        LogReg.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 279, 280, 36);
        LogReg.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(90, 320, 180, 40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);
        daftar = new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(440, 50, 150, 100);
        LogReg.add(daftar);
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 150, 30, 30);
        LogReg.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textnamadaftar);
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        LogReg.add(passworddaftar);
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 330, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 360, 200, 30);
        LogReg.add(textnotelp);
        labeltgllahir = new JLabel("tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(400, 390, 200, 30);
        LogReg.add(labeltgllahir);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 420, 200, 30);
        LogReg.add(texttgllahir);
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(400, 450, 200, 30);
        LogReg.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(400, 480, 200, 30);
        LogReg.add(textalamat);
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radiouser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiobuku.isSelected()) {
                    radiouser.setSelected(false);
                    ceklogin = true;
                }
            }
        });
        radiouser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiouser.isSelected()) {
                    radiobuku.setSelected(false);
                    ceklogin = false;
                }
            }
        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin == true) {
                    try {
                        AllObject.admin.dataAdmin();
                        AllObject.admin.login(textnamalogin.getText(), passworddaftar.getText());
                        String nama = AllObject.admin.adminEntity().getNama();
                        JOptionPane.showMessageDialog(null, "selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        BukuGUI asisten = new BukuGUI();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(
                                null, "NAMA atau password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else {
                    try {
                        AllObject.User.login(textnamalogin.getText(), passworddaftar.getText());
                        String nama = AllObject.User.userperpusEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        UserGUI prak = new UserGUI();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "NAMA atau password salah", " information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = textnamadaftar.getText();
                    String pass = String.valueOf(passworddaftar.getPassword());
                    String notelp = textnotelp.getText();
                    Date tgllahir =new SimpleDateFormat("dd/MM/yyyy").parse(texttgllahir.getText());
                    String alamat = textalamat.getText();
//                    System.out.println("masuk");
                    AllObject.User.insert(nama, pass, notelp, tgllahir, alamat);
//                    System.out.println("keluar");
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnotelp.setText(null);
        texttgllahir.setText(null);
        textnamalogin.setText(null);
        passwordlogin.setText(null);
        textalamat.setText(null);

    }
}