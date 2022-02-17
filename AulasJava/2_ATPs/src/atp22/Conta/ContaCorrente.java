package exerc_revisao.atp22.Conta;


public class ContaCorrente {
    private double saldo = 5000.00;
    private double saldoInicial;
    private double taxaSaque = 1.15;
    private int codCliente;

    public ContaCorrente(double mudaSaldo, int codigoCliente) {
        this.saldoInicial = saldo;
        this.saldo += mudaSaldo;
        this.codCliente = codigoCliente;
    }

    public void Saque(double valorSaque) {
        this.saldo -= (valorSaque + taxaSaque);
    }

    public void Deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    @Override
    public String toString() {
        String dadosConta = "Código do cliente: " + this.codCliente + " \nSaldo inicial: " + 
        this.saldoInicial +" \nTaxa de Saque: " + this.taxaSaque +
         "\nSaldo Final: " + this.saldo + 
         "\nSaldo Final: " + this.saldo;
        
        return dadosConta;
    }
}
