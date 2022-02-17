package exerc_revisao.atp17;

public class Main{
    public static void main(String[] args) {

        System.out.println("+------------ CÁCULO DE IMPOSTOS ------------+");
        
        CalculoImpostos ci = new CalculoImpostos();

        double iss = ci.calcISS(2500);
        System.out.printf("\nVocê pagará %.2f de ISS.", iss);
        
        double iof = ci.calcIOF(2500);
        System.out.printf("\n\nVocê pagará %.2f de IOF.", iof);
        
        double ir = ci.calcIR(2500);
        System.out.printf("\n\nVocê pagará %.2f de IR.\n", ir);

        System.out.println("\n++-----------------------------------------+\n");
        
    }
}