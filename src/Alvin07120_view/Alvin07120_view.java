package Alvin07120_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Alvin07120_view {
    String col[] = {"nama","matkul","praktikum","uts","npm","uas"};
    JFrame view = new JFrame();
    JButton back,update,ref;
    DefaultTableModel mod = new DefaultTableModel(col, 0);
    JTable tabel = new JTable(mod);
    JScrollPane scroll =new JScrollPane();
    JLabel datamhs,updatemhs,uaslama,uasbaru,utslama,utsbaru,praktikumlama,praktikumbaru;
    JTextField textuaslama,textuasbaru,textutslama,textutsbaru,textpraktikumlama,textpraktikumbaru;
    public Alvin07120_view(){
    for(int i=0;i<Alvin07120_allobjctrl.admin.viewmhs().size();i++){
        String Alvin07120_nama = Alvin07120_allobjctrl.admin.getMhs().get(i).setNamamhs();
        String Alvin07120_matkul = Alvin07120_allobjctrl.admin.getMhs().get(i).setMatkul();
        String Alvin07120_praktikum = Alvin07120_allobjctrl.admin.getMhs().get(i).getPraktikum();
        String Alvin07120_Uts = Alvin07120_allobjctrl.admin.getMhs().get(i).getUts();
        String Alvin07120_Npm = Alvin07120_allobjctrl.admin.getMhs().get(i).setNpm();
        String Alvin07120_Uas = Alvin07120_allobjctrl.admin.getMhs().get(i).getUas();
        Object[] object = {Alvin07120_nama,Alvin07120_matkul,Alvin07120_praktikum,Alvin07120_Uts,Alvin07120_Npm,Alvin07120_Uas};
       mod.addRow(object);
    }
    scroll.setViewportView(tabel);
    view.setSize(1000,600);
    view.setLayout(null);
    view.getContentPane().setBackground(Color.ORANGE);
    datamhs = new JLabel("Data Rapot");
    datamhs.setBounds(180,10,700,30);
    datamhs.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(datamhs);  
    scroll.setBounds(30,45,650,200);
    tabel.setModel(mod);
    view.add(scroll);   
    updatemhs = new JLabel("Update Nilai");
    updatemhs.setBounds(700,10,700,40);
    updatemhs.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(updatemhs);
    update = new JButton("Update");
    update.setBounds(720,380,150,40);
    update.setBackground(Color.GREEN);
    view.add(update);   
    uaslama = new JLabel("Masukkan UAS Lama :");
    uaslama.setBounds(700,50,180,40);
    view.add(uaslama);
    textuaslama = new JTextField();
    textuaslama.setBounds(700,80,200,20);
    view.add(textuaslama);  
    uasbaru = new JLabel("Masukkan UAS Baru :");
    uasbaru.setBounds(700,100,180,40);
    view.add(uasbaru);
    textuasbaru = new JTextField();
    textuasbaru.setBounds(700,130,200,20);
    view.add(textuasbaru);
    utslama = new JLabel("Masukkan UTS Lama :");
    utslama.setBounds(700,150,180,40);
    view.add(utslama);
    textutslama = new JTextField();
    textutslama.setBounds(700,180,200,20);
    view.add(textutslama);  
    utsbaru = new JLabel("Masukkan UTS Baru :");
    utsbaru.setBounds(700,200,180,40);
    view.add(utsbaru);
    textutsbaru = new JTextField();
    textutsbaru.setBounds(700,230,200,20);
    view.add(textutsbaru);
    praktikumlama = new JLabel("Masukkan Praktikum Lama :");
    praktikumlama.setBounds(700,250,180,40);
    view.add(praktikumlama);
    textpraktikumlama = new JTextField();
    textpraktikumlama.setBounds(700,280,200,20);
    view.add(textpraktikumlama);  
    praktikumbaru = new JLabel("Masukkan Praktikum Baru :");
    praktikumbaru.setBounds(700,300,180,40);
    view.add(praktikumbaru);
    textpraktikumbaru = new JTextField();
    textpraktikumbaru.setBounds(700,330,200,20);
    view.add(textpraktikumbaru);
    back = new JButton("Kembali");
    back.setBounds(30, 500, 150, 40);
    back.setBackground(Color.RED);
    view.add(back);         
    view.setLocationRelativeTo(null);
    view.setVisible(true);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            Alvin07120_tampilanGUI kembali = new Alvin07120_tampilanGUI();
            view.dispose();
            }
        });
    update.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae){
            try{
                String Alvin07120_Uas = textuaslama.getText();
                String newAlvin07120_Uas = textuasbaru.getText();
                String Alvin07120_Uts = textutslama.getText();
                String newAlvin07120_uts = textutsbaru.getText();
                String Alvin07120_Praktikum = textpraktikumlama.getText();
                String newAlvin07120_Praktikum = textpraktikumbaru.getText();
                Alvin07120_allobjctrl.admin.updateUas(Alvin07120_Uas, newAlvin07120_Uas);
                Alvin07120_allobjctrl.admin.updateUts(Alvin07120_Uts, newAlvin07120_uts);
                Alvin07120_allobjctrl.admin.updatePraktikum(Alvin07120_Praktikum, newAlvin07120_Praktikum);
                JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
            kosong();
            Alvin07120_tampilanGUI kembali = new Alvin07120_tampilanGUI();
            view.dispose();
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);               
            }
             }
             });   
    }
     void kosong(){
        textuaslama.setText(null);
        textuasbaru.setText(null);    
        textutslama.setText(null);
        textutsbaru.setText(null);
        textpraktikumlama.setText(null);
        textpraktikumbaru.setText(null);
    }
}
  