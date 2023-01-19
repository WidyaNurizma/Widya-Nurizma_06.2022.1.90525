package View;
import Controller.AllObjectModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controller.UserPerpusController;
import Entity.UserPerpusEntity;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BukuGUI {
    private static UserPerpusController User = new UserPerpusController();
    JFrame Buku = new JFrame();
    JTable tabeluser = new JTable();
    JScrollPane scrollbuku = new JScrollPane(tabeluser);
    JButton back, verif;
    JLabel admin, namalabel, passlabel;
    JTextField namatext, passtext;
   
     public BukuGUI() {
        Buku.setSize(650, 500);
        Buku.setLayout(null);
        Buku.getContentPane().setBackground(Color.WHITE);
        admin = new JLabel("Admin");
        admin.setBounds(250, 30, 200, 30);
        admin.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Buku.add(admin);
        namalabel = new JLabel("Nama");
        namalabel.setBounds(50, 320, 100, 30);
        Buku.add(namalabel);
        namatext = new JTextField();
        namatext.setBounds(50, 350, 100, 30);
        Buku.add(namatext);
        passlabel = new JLabel("password");
        passlabel.setBounds(200, 320, 100, 30);
        Buku.add(passlabel);
        passtext = new JTextField();
        passtext.setBounds(200, 350, 100, 30);
        Buku.add(passtext);
        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GREEN);
        Buku.add(verif);
        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.red);
        Buku.add(back);
        Buku.setLocationRelativeTo(null);
        Buku.setVisible(true);
        Buku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Buku.dispose();
                GUI men = new GUI();
            }
        });
        verif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = namatext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel.userperpusModel.cekData(nama, pass);
//                AllObject.admin.updateIsVerified(index, AllObject.User.showDaftaruser(index).getIndexUser(), UserPerpusEntity);
            }
        });
        tabeluser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabeluser.getSelectedRow();
                namatext.setText(AllObject.User.daftaruser().getValueAt(i, 0).toString());
                passtext.setText(AllObject.User.daftaruser().getValueAt(i, 1).toString());
            }
        });
    }
}
