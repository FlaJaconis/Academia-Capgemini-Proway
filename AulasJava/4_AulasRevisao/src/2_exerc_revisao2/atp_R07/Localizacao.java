package exerc_revisao2.atp_R07;


public class Localizacao {
private int latitude;
private int longitude;
private int inilatitude;
private int inilongitude;

public Localizacao(int entralatitude, int entralongitude){
    this.inilatitude = entralatitude;
    this.inilongitude = entralongitude;
}
    public void setLatitude(int entralatitude) {
        this.latitude = entralatitude;
    }
    public int getLatitude() {
        return this.latitude;
    }
    
    public void setLongitude(int entralongitude) {
        this.longitude = entralongitude;
    }
    public int getLongitude() {
        return this.longitude;
    }
    
    @Override
    public String toString() {
      
        return 
        "Latitudade inicial = " + inilatitude +"\n"+
        "Longitude inicial = " + inilongitude +"\n" +
        "Latitudade final = " + latitude +"\n"+
        "Longitude final = " + longitude +"\n";
    }
}
