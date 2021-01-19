package Alvin07120_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Alvin07120_remove {
    JFrame del =new JFrame();
    JLabel remove,labelnama,labelnpm;
    JTextField txtnama,txtnpm;
    JButton back,dels; 
public Alvin07120_remove(){
    del.setSize(700,400);
    del.setLayout(null);
    del.getContentPane().setBackground(Color.ORANGE);  
    remove = new JLabel("Remove Data");
    remove.setBounds(220,10,700,40);
    remove.setFont(new Font("Times New Roman",Font.BOLD,40));
    del.add(remove);
    labelnama = new JLabel("Nama Mhs:");
    labelnama.setBounds(50,50,180,40);
    del.add(labelnama);
    txtnama = new JTextField();
    txtnama.setBounds(50,80,200,20);
    del.add(txtnama);
    labelnpm = new JLabel("Npm Mhs :");
    labelnpm.setBounds(50,90,180,40);
    del.add(labelnpm);
    txtnpm = new JTextField();
    txtnpm.setBounds(50,120,200,20);
    del.add(txtnpm);
    back = new JButton("back");
    back.setBounds(270,250,150,40);
    back.setBackground(Color.red);
    del.add(back); 
    dels = new JButton("Hapus");
    dels.setBounds(65,200,150,40);
    dels.setBackground(Color.GREEN);
    del.add(dels);
    del.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    del. setVisible(true);
    del.setLocationRelativeTo(null);   
    back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Alvin07120_tampilanGUI BMenu = new Alvin07120_tampilanGUI();
        del.dispose();
        }
      });    
    dels.addActionListener(new ActionListener(){           
        @Override
            public void actionPerformed (ActionEvent ae){
                try{
            String Alvin07120_Nama = txtnama.getText();
            String Alvin07120_Npm = txtnpm.getText();
            Alvin07120_allobjctrl.admin.Ambil(Alvin07120_Nama,Alvin07120_Npm);
            JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                kosong();
                Alvin07120_tampilanGUI gui = new Alvin07120_tampilanGUI();
                del.dispose();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
        del.dispose();
          }
         }       
        });
    }void kosong(){
        txtnama.setText(null);
        txtnpm.setText(null);
    }
   
}