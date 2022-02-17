package exerc_revisao.atp18;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        
        cc1.setAgencia(01);
        int ag = cc1.getAgencia();
        System.out.printf("A sua agência é: %d \n", ag);
        
        cc1.setNumero(1234);
        int ccor = cc1.getNumero();
        System.out.printf("A sua conta corrente é: %d \n", ccor);

        cc1.setCodigoCliente(300);
        int codCl = cc1.CodigoCliente();
        System.out.printf("A sua agência é: %d \n", codCl);

        cc1.setSaldo(1000.00);
        double s = cc1.getSaldo();
        System.out.printf("O seu saldo é: %.2f \n", s);
    }
    
}
