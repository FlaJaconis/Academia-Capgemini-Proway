package exerc_revisao.atp16;

import java.util.Scanner;

public class CalculadoraTaxas {
    private int saques;
    private double txTransf = 0.00001;
    private double txSacar = 1.3;

    public double entraValor(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        double valor = Double.parseDouble(sc.nextLine());
        return valor;
    }

    public double transferir(double valor) {
        double taxa = valor * txTransf;
        return taxa;
    }

    public double txSaque() {

        double valorTaxa = 0;

        saques++;
        if (saques % 5 == 0) {
            valorTaxa = txSacar;
        }
        return valorTaxa;
    }
}
