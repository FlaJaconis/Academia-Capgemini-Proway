package exerc_revisao2.atp_R07;

public class Main {
    public static void main(String[] args) {
        Localizacao l = new Localizacao(1023, 3045);
       
        l.setLatitude(1056);
        l.setLongitude(3246);
       
        System.out.println("======== Parâmetros de localização ========");
        System.out.println(l);
    }
    
}
