package exerc_revisao.atp17;

public class CalculoImpostos {
    private double txiss = 0.05;
    private double txiof = 0.0038;
    private double txir = 0.075;

    public double calcISS(double valor) {
        double ISS = valor * txiss;
        return ISS;
    }

    public double calcIOF(double valor) {
        double IOF = valor * txiof;
        return IOF;
    }

    public double calcIR(double valor) {
        double IR = valor * txir;
        return IR;
    }

}