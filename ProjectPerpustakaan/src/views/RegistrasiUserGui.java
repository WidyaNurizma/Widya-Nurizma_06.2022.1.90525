package views;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.*;

import controllers.PerpusController;
import utils.DateConvert;

public class RegistrasiUserGui extends MainFrame {
    private JLabel registrasiIcon;
    private JLabel registrasiTitle;
    private JLabel namaLabel, noTelpLabel, alamatLabel, ttlLabel, unameLabel, passwordLabel;
    private JTextField namaField, alamatField, ttlField, noTelpField, unameField;
    private JPasswordField passwordField;
    private JButton daftarBtn;

    public RegistrasiUserGui() {
        super("Perpustakaan - Registrasi", 375, 675);
    }

    @Override
    protected void component() {
        registrasiIcon = new JLabel(loadImage("src/images/login.png", 80, 80));
        boundedAdd(registrasiIcon, 28, 35, 80, 80);

        registrasiTitle = new JLabel("PERPUSTAKAAN");
        setFontSize(registrasiTitle, 24);
        setFontStyle(registrasiTitle, Font.BOLD);
        boundedAdd(registrasiTitle, 123, 65, 200, 30);

        namaLabel = new JLabel("Nama Lengkap");
        setFontSize(namaLabel, 14);
        setFontStyle(namaLabel, Font.BOLD);
        boundedAdd(namaLabel, 30, 130, 105, 20);

        namaField = new JTextField();
        boundedAdd(namaField, 30, 155, 300, 30);

        noTelpLabel = new JLabel("No Telpon");
        setFontSize(noTelpLabel, 14);
        setFontStyle(noTelpLabel, Font.BOLD);
        boundedAdd(noTelpLabel, 30, 190, 105, 20);

        noTelpField = new JTextField();
        boundedAdd(noTelpField, 30, 215, 300, 30);

        alamatLabel = new JLabel("Alamat");
        setFontSize(alamatLabel, 14);
        setFontStyle(alamatLabel, Font.BOLD);
        boundedAdd(alamatLabel, 30, 250, 105, 20);

        alamatField = new JTextField();
        boundedAdd(alamatField, 30, 275, 300, 30);

        ttlLabel = new JLabel("Tanggal Lahir");
        setFontSize(ttlLabel, 14);
        setFontStyle(ttlLabel, Font.BOLD);
        boundedAdd(ttlLabel, 30, 310, 105, 20);

        ttlField = new JTextField();
        boundedAdd(ttlField, 30, 335, 300, 30);

        JSeparator separator = new JSeparator();
        boundedAdd(separator, 30, 380, 300, 2);

        unameLabel = new JLabel("Buat Username");
        setFontSize(unameLabel, 14);
        setFontStyle(unameLabel, Font.BOLD);
        boundedAdd(unameLabel, 30, 395, 200, 20);

        unameField = new JTextField();
        boundedAdd(unameField, 30, 420, 300, 30);

        passwordLabel = new JLabel("Buat Password");
        setFontSize(passwordLabel, 14);
        setFontStyle(passwordLabel, Font.BOLD);
        boundedAdd(passwordLabel, 30, 460, 155, 20);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 30, 485, 300, 30);

        daftarBtn = new JButton("Buat Akun");
        setFontSize(daftarBtn, 18);
        daftarBtn.setFocusPainted(false);
        daftarBtn.setBackground(color("#13e82f"));
        daftarBtn.setForeground(Color.white);
        boundedAdd(daftarBtn, 30, 535, 300, 40);
    }

    @Override
    protected void event() {

        daftarBtn.addActionListener(e -> {
            String namaLengkap, noTelp, alamat, tanggalLahir, username, password;

            namaLengkap = namaField.getText();
            noTelp = noTelpField.getText();
            alamat = alamatField.getText();
            tanggalLahir = ttlField.getText();
            username = unameField.getText();
            password = String.valueOf(passwordField.getPassword());

            Date date = DateConvert.toDate(tanggalLahir);

            // Cek Format Tanggal
            if (date != null) {
                PerpusController perpusC_ = new PerpusController();
                boolean status = perpusC_.registrasiUser(namaLengkap, noTelp, alamat, date, username, password);

                // Cek Status Registrasi
                if (status == true) {
                    JOptionPane.showMessageDialog(null, "Registrasi Berhasil");

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username telah dipakai.",
                            "Registrasi Gagal", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Format Tanggal Lahir Salah !",
                        "Registrasi Gagal", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
