package exerc_revisao.atp21;

public class Conta {
    private double saldo;
    private int codCliente;

    public void transferencia (double valorTransf){
        saldo -= valorTransf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    public int getCodCliente(){
        return this.codCliente;
    }
    
}
