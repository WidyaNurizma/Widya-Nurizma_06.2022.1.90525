package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controllers.PerpusController;
import entity.BukuEntity;

public class DashboardAdminGui extends MainFrame {
    private JLabel titleLabel;
    private JButton tambahButton, editButton, hapusButton;
    private JButton refreshButton;
    private JButton keluarButton;

    private JTable bukuTable;
    private JScrollPane scrollPane;

    private JTextField selectedField = new JTextField();

    public DashboardAdminGui() {
        super("Perpustakaan", 800, 600);
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("PERPUSTAKAAN");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 35, 200, 30);

        tambahButton = new JButton("Tambah Buku");
        tambahButton.setFocusPainted(false);
        tambahButton.setBackground(color("#13e82f"));
        tambahButton.setForeground(Color.white);
        boundedAdd(tambahButton, 300, 535, 110, 30);

        // editButton = new JButton("Edit Buku");
        // editButton.setFocusPainted(false);
        // editButton.setBackground(color("#2ae8c5"));
        // editButton.setForeground(Color.white);
        // boundedAdd(editButton, 320, 535, 100, 30);

        hapusButton = new JButton("Hapus Buku");
        hapusButton.setFocusPainted(false);
        hapusButton.setBackground(color("#e8a22a"));
        hapusButton.setForeground(Color.white);
        boundedAdd(hapusButton, 440, 535, 100, 30);

        refreshButton = new JButton("Refresh");
        refreshButton.setFocusPainted(false);
        refreshButton.setBackground(color("#54dee8"));
        refreshButton.setForeground(Color.white);
        boundedAdd(refreshButton, 570, 535, 80, 30);

        bukuTable = new JTable();
        bukuTable.setModel(createDataTable());
        scrollPane = new JScrollPane(bukuTable);
        boundedAdd(scrollPane, 25, 72, 745, 440);

        keluarButton = new JButton("Keluar");
        keluarButton.setFocusPainted(false);
        keluarButton.setBackground(color("#d4382c"));
        keluarButton.setForeground(Color.white);
        boundedAdd(keluarButton, 675, 535, 90, 30);
    }

    @Override
    protected void event() {

        tambahButton.addActionListener(e -> {
            new TambahBukuGui().setVisible(true);
        });

        bukuTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow();
                String selectedId = bukuTable.getValueAt(i, 0).toString();
                selectedField.setText(selectedId);
            }
        });

        refreshButton.addActionListener(e -> {
            bukuTable.setModel(createDataTable());
        });

        keluarButton.addActionListener((e) -> {
            new LoginUserGui().setVisible(true);
            dispose();
        });

        hapusButton.addActionListener((e) -> {
            try {
                int id = Integer.parseInt(selectedField.getText());
                PerpusController perpusC_ = new PerpusController();
                BukuEntity bukuSelected = perpusC_.findBukubyId(id);

                if (bukuSelected != null) {
                    new HapusBukuGui(bukuSelected).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih Buku yang ingin di Hapus");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Pilih Buku yang ingin di Hapus");
            }
        });
    }

    private DefaultTableModel createDataTable() {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object column[] = {
                "Id",
                "Judul Buku",
                "Penulis",
                "Penerbit",
                "Halaman",
                "Tahun Terbit",
        };
        dataTable.setColumnIdentifiers(column);

        PerpusController perpusC_ = new PerpusController();

        ArrayList<BukuEntity> bukuList = perpusC_.getBukuList();

        for (BukuEntity buku : bukuList) {

            Object[] data = new String[] {
                    String.valueOf(buku.getId()),
                    buku.getJudul(),
                    buku.getPenulis(),
                    buku.getPenerbit(),
                    String.valueOf(buku.getJumlahHalaman()),
                    buku.getTahunTerbit()
            };

            dataTable.addRow(data);
        }
        return dataTable;
    }
}
