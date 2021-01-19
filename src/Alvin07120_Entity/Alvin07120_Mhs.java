package Alvin07120_Entity;
public class Alvin07120_Mhs extends Alvin07120_Abstract {
    private String Alvin07120_nama,Alvin07120_Matkul,Alvin07120_Praktikum,Alvin07120_Uts;
    private String Alvin07120_Npm;
    private String Alvin07120_Uas;
    public Alvin07120_Mhs(String Alvin07120_nama, String Alvin07120_matkul, String Alvin07120_praktikum, String Alvin07120_uts, String Alvin07120_npm, 
            String Alvin07120_uas) {
        this.Alvin07120_nama=Alvin07120_nama;
        this.Alvin07120_Matkul=Alvin07120_matkul;
        this.Alvin07120_Praktikum=Alvin07120_praktikum;
        this.Alvin07120_Uts=Alvin07120_uts;
        this.Alvin07120_Npm=Alvin07120_npm;
        this.Alvin07120_Uas=Alvin07120_uas; 
    }
    public String setNamamhs(){
        return this.Alvin07120_nama;
    }
    public String setMatkul(){
        return this.Alvin07120_Matkul;    
    }
    public String setNpm() {
        return this.Alvin07120_Npm;
    }
    public String getUas(){
        return this.Alvin07120_Uas;
    }
    public void setUas(String Uas){
        this.Alvin07120_Uas = Uas;
    }
    public String getUts(){
        return this.Alvin07120_Uts;
    }
    public void setUts(String Uts){
        this.Alvin07120_Uts = Uts;
    }
    public String getPraktikum(){
        return this.Alvin07120_Praktikum;
    }
    public void setPraktikum(String Praktikum){
        this.Alvin07120_Praktikum = Praktikum;
    }
}
    