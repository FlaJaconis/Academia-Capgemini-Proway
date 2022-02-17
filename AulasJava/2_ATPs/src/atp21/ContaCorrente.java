package exerc_revisao.atp21;

public class ContaCorrente extends Conta {
    private double txTransferencia = 10.50;
    private double txManutencao = 2.50;
    private double numTransferencias = 0;
    

    @Override
    public void transferencia(double valorTransf) {
        super.transferencia(valorTransf);
        double saldoFinal = this.getSaldo() - txTransferencia;
        this.setSaldo(saldoFinal);
        
        
        if (numTransferencias % 5 == 0) {
            saldoFinal = this.getSaldo() - txManutencao;
            this.setSaldo(saldoFinal);
     
        }
        this.numTransferencias++;
    }

}
