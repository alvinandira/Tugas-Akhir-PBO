package Alvin07120_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Alvin07120_tampilanGUI {
    JFrame TamAwal = new JFrame();
    JLabel judul;
    JButton daftar,update,remove,tampil;
public Alvin07120_tampilanGUI(){
TamAwal.setSize(760,300);
TamAwal.setLayout(null);
TamAwal.getContentPane().setBackground(Color.yellow);
judul = new JLabel("Data Rapot");
judul.setBounds(290,10,700,40);
judul.setFont(new Font("Times New Roman",Font.BOLD,40));
TamAwal.add(judul);
daftar = new JButton("Daftar Mahasiswa");
daftar.setBounds(290,100,200,20);
daftar.setBackground(Color.ORANGE);
daftar.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(daftar);
remove = new JButton("Remove Nilai");
remove.setBounds(290,130,200,20);
remove.setBackground(Color.ORANGE);
remove.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(remove);
tampil = new JButton("Lihat Data");
tampil.setBounds(290,160,200,20);
tampil.setBackground(Color.ORANGE);
tampil.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(tampil);
TamAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
TamAwal. setVisible(true);
TamAwal.setLocationRelativeTo(null);
daftar.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Alvin07120_daftar daftar = new Alvin07120_daftar();
        TamAwal.dispose();
        }
      });
tampil.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Alvin07120_view view = new Alvin07120_view();
        TamAwal.dispose();
        }
      });
remove.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Alvin07120_remove dels = new Alvin07120_remove();
        TamAwal.dispose();
        }
      });
    }
  }
