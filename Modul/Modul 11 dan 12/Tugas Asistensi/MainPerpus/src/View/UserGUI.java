package View;
import Entity.BukuEntity;
import Entity.UserPerpusEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class UserGUI {
    JFrame User = new JFrame();
    JButton back, daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri, daftaruser;
    JComboBox pilbuku = new JComboBox(BukuEntity.Buku);
    int cek = AllObject.User.cekDaftaruser(AllObject.User.userperpusEntity().getNama());

    public UserGUI() {
        User.setSize(720, 600);
        User.setLayout(null);
        User.getContentPane().setBackground(Color.WHITE);
        datadiri = new JLabel("Data User");
        datadiri.setFont(new Font("Times New Roman", Font.BOLD, 30));
        datadiri.setBounds(90, 30, 200, 30);
        User.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        User.add(area);
        daftaruser = new JLabel("Daftar User");
        daftaruser.setBounds(450, 30, 250, 30);
        daftaruser.setFont(new Font("Times New Roman", Font.BOLD, 30));
        User.add(daftaruser);
        pilbuku.setBounds(450, 90, 230, 30);
        User.add(pilbuku);
        daftarbtn = new JButton("Daftar");
        daftarbtn.setBounds(500, 200, 100, 30);
        daftarbtn.setBackground(Color.GREEN);
        User.add(daftarbtn);
        back = new JButton("back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.red);
        User.add(back);
        User.setVisible(true);
        User.setLocationRelativeTo(null);
        User.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (cek == -1) {
            JOptionPane.showMessageDialog(null, "Anda Belum Daftar", "information", JOptionPane.INFORMATION_MESSAGE);
        } else if (cek == -2) {
            JOptionPane.showMessageDialog(null, "Anda Belun Daftar", "information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            area.setText(databuku());
        }
        daftarbtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                int indexUser = pilbuku.getSelectedIndex();
                AllObject.User.daftarUser(indexUser,AllObject.User.getData(), false);
                area.setText(databuku());
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                User.dispose();
                GUI men = new GUI();
            }
        });
    }

    public String databuku() {
        int cek = AllObject.User.cekDaftaruser(AllObject.User.userperpusEntity().getNama());
        String cekverif;
        if (AllObject.User.showDaftaruser(cek).isVerified() == false) {
            cekverif = "belum diverifikasi";
        } else {
            cekverif = "sudah diverifikasi";
        }
        String text = "Nama = " + AllObject.User.showDaftaruser(cek).getuser().getNama() + "\n"
                + "No Telp = " + AllObject.User.showDaftaruser(cek).getuser().getNotelp() + "\n" + "Tanggal Lahir = " + new SimpleDateFormat("dd-MM-yyyy").
                format(AllObject.User.showDaftaruser(cek).getuser().getTglLahir()) + "\n" + "verifikasi = " + cekverif + "\n" + "Alamat = " + AllObject.User.
                showDaftaruser(cek).getuser().getAlamat() + "\n" + "Buku = " + BukuEntity.Buku[AllObject.User.showDaftaruser(cek).getIndexUser()];
        return text;
    }
}