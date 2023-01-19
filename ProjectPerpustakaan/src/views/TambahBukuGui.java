package views;

import javax.swing.*;

import controllers.PerpusController;
import java.awt.Color;
import java.awt.Font;

public class TambahBukuGui extends MainFrame {
    private JLabel titleLabel;
    private JLabel judulLabel, penulisLabel, penerbitLabel, halamanLabel, tahunTerbitLabel;
    private JTextField judulField, penulisField, penerbitField, halamanField, tahunTerbitField;
    private JButton simpanButton;

    public TambahBukuGui() {
        super("Tambah Buku", 400, 600);
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("TAMBAH BUKU");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 25, 330, 30);

        judulLabel = new JLabel("Judul Buku");
        setFontSize(judulLabel, 13);
        setFontStyle(judulLabel, Font.BOLD);
        boundedAdd(judulLabel, 30, 80, 330, 18);

        judulField = new JTextField();
        boundedAdd(judulField, 30, 100, 330, 30);

        penulisLabel = new JLabel("Penulis");
        setFontSize(penulisLabel, 13);
        setFontStyle(penulisLabel, Font.BOLD);
        boundedAdd(penulisLabel, 30, 150, 330, 18);

        penulisField = new JTextField();
        boundedAdd(penulisField, 30, 170, 330, 30);

        penerbitLabel = new JLabel("Penerbit");
        setFontSize(penerbitLabel, 13);
        setFontStyle(penerbitLabel, Font.BOLD);
        boundedAdd(penerbitLabel, 30, 220, 330, 18);

        penerbitField = new JTextField();
        boundedAdd(penerbitField, 30, 240, 330, 30);

        halamanLabel = new JLabel("Jumlah Halaman");
        setFontSize(halamanLabel, 13);
        setFontStyle(halamanLabel, Font.BOLD);
        boundedAdd(halamanLabel, 30, 290, 330, 18);

        halamanField = new JTextField();
        boundedAdd(halamanField, 30, 310, 330, 30);

        tahunTerbitLabel = new JLabel("Tahun Terbit");
        setFontSize(tahunTerbitLabel, 13);
        setFontStyle(tahunTerbitLabel, Font.BOLD);
        boundedAdd(tahunTerbitLabel, 30, 360, 330, 18);

        tahunTerbitField = new JTextField();
        boundedAdd(tahunTerbitField, 30, 380, 330, 30);

        simpanButton = new JButton("Tambah");
        simpanButton.setFocusPainted(false);
        simpanButton.setBackground(color("#13e82f"));
        simpanButton.setForeground(Color.white);
        boundedAdd(simpanButton, 155, 470, 85, 30);
    }

    @Override
    protected void event() {
        simpanButton.addActionListener(e -> {
            String judulBuku = judulField.getText();
            String penulis = penulisField.getText();
            String penerbit = penerbitField.getText();
            int halaman = Integer.parseInt(halamanField.getText());
            String tahunTerbit = tahunTerbitField.getText();

            PerpusController perpusC_ = new PerpusController();
            perpusC_.addBuku(judulBuku, penulis, penerbit, halaman, tahunTerbit);

            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Buku");

            setVisible(false);
        });
    }

}
