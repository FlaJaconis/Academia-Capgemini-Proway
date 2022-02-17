package modulo2.aula17_ClasseAbstrata_Construtor;

public class ContaCorrente extends Conta {
    private double taxa = 2.5;
   
    public ContaCorrente(double saldoInicial, String cliente){
        super(saldoInicial, cliente);
    }

    @Override
    public String toString() {        
        return super.toString() + "," + this.taxa;
    }
}
