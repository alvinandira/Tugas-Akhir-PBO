package Alvin07120_model;
import Alvin07120_Entity.Alvin07120_Mhs;
import java.util.ArrayList;
import java.util.Scanner;
public class Alvin07120_Mhsmodel implements Alvin07120_Interfaces {
    public ArrayList<Alvin07120_Mhs> dataMhs;
    static Scanner input = new Scanner(System.in);
    public Alvin07120_Mhsmodel(){
        this.dataMhs = new ArrayList<>();
    }
    public void dataMhs (Alvin07120_Mhs Mhs){
        dataMhs.add(Mhs);   
    }
    public ArrayList<Alvin07120_Mhs>viewMhs(){
        return dataMhs;
    }
    public ArrayList<Alvin07120_Mhs>getArrMhs(){
        return dataMhs;
    }
    @Override
    public void view() {
    }
    @Override
    public void remove(String Alvin07120_nama, String Alvin07120_Npm) {
        for(int i=0;i<dataMhs.size();i++){
            if(Alvin07120_nama.equals(dataMhs.get(i).setNamamhs())&&
                    Alvin07120_Npm.equals(dataMhs.get(i).setNpm())){
                dataMhs.remove(i);
            }
        }
    }
    @Override
    public void updateUas(String Alvin07120_Uas, String newAlvin07120_Uas) {
        for(int i=0;i<dataMhs.size();i++){
            if(Alvin07120_Uas.equals(dataMhs.get(i).getUas()))
            {
                dataMhs.get(i).setUas(newAlvin07120_Uas);
            }
        }
    }
    @Override
    public void updateUts(String Alvin07120_Uts, String newAlvin07120_Uts) {
        for(int i=0;i<dataMhs.size();i++){
            if(Alvin07120_Uts.equals(dataMhs.get(i).getUts()))
            {
                dataMhs.get(i).setUts(newAlvin07120_Uts);
            }
        }
    }
    @Override
    public void updatePraktikum(String Alvin07120_Praktikum, String newAlvin07120_Praktikum) {
         for(int i=0;i<dataMhs.size();i++){
            if(Alvin07120_Praktikum.equals(dataMhs.get(i).getPraktikum()))
            {
                dataMhs.get(i).setPraktikum(newAlvin07120_Praktikum);
            }
        }
    }
}