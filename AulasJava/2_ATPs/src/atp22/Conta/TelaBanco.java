package exerc_revisao.atp22.Conta;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(5000.00, 13);
        cc.Saque(230.00);
        cc.Deposito(1000.00);

        System.out.println(cc);
    }
    
}
