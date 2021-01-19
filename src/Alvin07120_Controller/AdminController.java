package Alvin07120_Controller;
import java.util.ArrayList;
import Alvin07120_Entity.Alvin07120_Mhs;
public class AdminController {
    public void insertMhs(Alvin07120_Mhs mhs){
       AllObject.mhsmodel.dataMhs(mhs);
    }
    public void Ambil(String Alvin07120_Nama,String Alvin07120_Npm){
        AllObject.mhsmodel.remove(Alvin07120_Nama,Alvin07120_Npm);
    }
    public void updateUas(String Alvin07120_Uas,String newAlvin07120_Uas){
        AllObject.mhsmodel.updateUas(Alvin07120_Uas, newAlvin07120_Uas);
    }
    public void updateUts(String Alvin07120_Uts,String newAlvin07120_Uts){
        AllObject.mhsmodel.updateUts(Alvin07120_Uts, newAlvin07120_Uts);
    }
    public void updatePraktikum(String Alvin07120_Praktikum,String newAlvin07120_Praktikum){
        AllObject.mhsmodel.updatePraktikum(Alvin07120_Praktikum, newAlvin07120_Praktikum);
    }
    public void Tampil(){
        AllObject.mhsmodel.view();
    }
    public ArrayList<Alvin07120_Mhs>viewmhs(){
        return AllObject.mhsmodel.dataMhs;
    }
    public ArrayList<Alvin07120_Mhs> getMhs(){
        return AllObject.mhsmodel.getArrMhs();
    }
    
}
 



