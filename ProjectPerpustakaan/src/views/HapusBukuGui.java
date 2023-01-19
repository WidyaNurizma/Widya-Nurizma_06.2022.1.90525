package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import controllers.PerpusController;
import entity.BukuEntity;

public class HapusBukuGui extends MainFrame {
    private JLabel titleLabel, subLabel;
    private JLabel judulBukuLabel;
    private JButton hapusButton, batalButton;

    private BukuEntity buku;

    public HapusBukuGui(BukuEntity buku) {
        super("Perpustakaan", 400, 250);

        this.buku = buku;

    }

    @Override
    protected void component() {
        titleLabel = new JLabel("EDIT BUKU");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 25, 330, 30);

        subLabel = new JLabel("Ingin Menghapus Buku dengan Judul dibawah ini ?");
        boundedAdd(subLabel, 25, 80, 330, 18);

        judulBukuLabel = new JLabel(buku.getJudul());
        setFontStyle(judulBukuLabel, Font.BOLD);
        setFontSize(judulBukuLabel, 15);
        boundedAdd(judulBukuLabel, 25, 110, 330, 18);

        hapusButton = new JButton("Hapus");
        hapusButton.setBackground(color("#e82c13"));
        hapusButton.setFocusPainted(false);
        hapusButton.setForeground(Color.white);
        boundedAdd(hapusButton, 100, 140, 85, 30);

        batalButton = new JButton("Batal");
        batalButton.setFocusPainted(false);
        batalButton.setBackground(Color.gray);
        batalButton.setForeground(Color.black);
        boundedAdd(batalButton, 210, 140, 85, 30);

    }

    @Override
    protected void event() {
        hapusButton.addActionListener(e -> {
            PerpusController perpusC_ = new PerpusController();

            perpusC_.deleteBuku(buku);

            dispose();
        });

        batalButton.addActionListener(e -> {
            dispose();
        });
    }

}
