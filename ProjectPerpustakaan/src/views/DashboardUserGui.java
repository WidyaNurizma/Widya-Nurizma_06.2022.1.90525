package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controllers.PerpusController;
import entity.BukuEntity;

public class DashboardUserGui extends MainFrame {
    private JLabel titleLabel;
    private JButton keluarButton;

    private JTable bukuTable;
    private JScrollPane scrollPane;

    private JTextField selectedField = new JTextField();

    public DashboardUserGui() {
        super("Perpustakaan", 800, 600);
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("PERPUSTAKAAN");
        setFontSize(titleLabel, 24);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 25, 35, 200, 30);

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
        bukuTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow();
                String selectedId = bukuTable.getValueAt(i, 0).toString();
                selectedField.setText(selectedId);
            }
        });

        keluarButton.addActionListener((e) -> {
            new LoginUserGui().setVisible(true);
            dispose();
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
