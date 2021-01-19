package Alvin07120_view;
import Alvin07120_Entity.Alvin07120_Mhs;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Alvin07120_daftar {
    JFrame daftar = new JFrame();
    JLabel daftarlabel;
    JTextField txtnama,txtmatkul,txtpraktikum,txtuts,txtnpm,txtuas;
    JLabel labelnama,labelmatkul,labelpraktikum,labeluts,labelnpm,labeluas;
    JButton back,reg;
public Alvin07120_daftar(){
    daftar.setSize(700,630);
    daftar.setLayout(null);
    daftar.getContentPane().setBackground(Color.ORANGE); 
    daftarlabel = new JLabel("Daftar Mahasiswa");
    daftarlabel.setBounds(220,10,700,40);
    daftarlabel.setFont(new Font("Times New Roman",Font.BOLD,25));
    daftar.add(daftarlabel);
    labelnama = new JLabel("Nama Mahasiswa :");
    labelnama.setBounds(250,50,180,40);
    daftar.add(labelnama);
    txtnama = new JTextField();
    txtnama.setBounds(250,80,200,20);
    daftar.add(txtnama);
    labelmatkul = new JLabel("Matkul :");
    labelmatkul.setBounds(250,90,180,40);
    daftar.add(labelmatkul);
    txtmatkul = new JTextField();
    txtmatkul.setBounds(250,120,200,20);
    daftar.add(txtmatkul); 
    labelpraktikum = new JLabel("Nilai Praktikum :");
    labelpraktikum.setBounds(250,130,180,40);
    daftar.add(labelpraktikum);
    txtpraktikum = new JTextField();
    txtpraktikum.setBounds(250,160,200,20);
    daftar.add(txtpraktikum);
    labeluts = new JLabel("Nilai Uts :");
    labeluts.setBounds(250,170,180,40);
    daftar.add(labeluts);
    txtuts = new JTextField();
    txtuts.setBounds(250,200,200,20);
    daftar.add(txtuts);
    labelnpm = new JLabel("Npm :");
    labelnpm.setBounds(250,210,180,40);
    daftar.add(labelnpm);
    txtnpm = new JTextField();
    txtnpm.setBounds(250,240,200,20);
    daftar.add(txtnpm);
    labeluas = new JLabel("Nilai Uas :");
    labeluas.setBounds(250,250,180,40);
    daftar.add(labeluas);
    txtuas = new JTextField();
    txtuas.setBounds(250,280,200,20);
    daftar.add(txtuas);
    reg = new JButton("Daftar");
    reg.setBounds(270,310,150,40);
    reg.setBackground(Color.GREEN);
    daftar.add(reg);
    back = new JButton("back");
    back.setBounds(270,350,150,40);
    back.setBackground(Color.red);
    daftar.add(back);
    daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    daftar. setVisible(true);
    daftar.setLocationRelativeTo(null);    
    back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Alvin07120_tampilanGUI gui = new Alvin07120_tampilanGUI();
        daftar.dispose();
        }
      });
    reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            try{
            String Alvin07120_nama = txtnama.getText();
            String Alvin07120_matkul = txtmatkul.getText();
            String Alvin07120_praktikum = txtpraktikum.getText();
            String Alvin07120_uts = txtuts.getText();
            String Alvin07120_npm = txtnpm.getText();
            String Alvin07120_uas = txtuas.getText();
            Alvin07120_allobjctrl.admin.insertMhs(new Alvin07120_Mhs(Alvin07120_nama, Alvin07120_matkul, Alvin07120_praktikum,
                    Alvin07120_uts, Alvin07120_npm, Alvin07120_uas)); 
            JOptionPane.showMessageDialog(null,"Daftar Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
            kosong();        
            }catch(Exception exception){
               JOptionPane.showMessageDialog(null,"Format Salah","Regristasi Gagal",JOptionPane.INFORMATION_MESSAGE); 
            }
          }
            });           
    }
    void kosong(){
        txtnama.setText(null);
        txtmatkul.setText(null);
        txtnpm.setText(null);
        txtpraktikum.setText(null);
        txtuas.setText(null);
        txtuts.setText(null);}}