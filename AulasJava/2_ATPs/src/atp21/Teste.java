package exerc_revisao.atp21;

public class Teste {
    public static void main(String[] args) {

        System.out.println("+=========================+++ BANCO CAP +++==========================+");
        System.out.println("+----------------------- Extrato de Operações -----------------------+");

        //objeto 1
        Conta c1 = new Conta();
        c1.setCodCliente(01);
        c1.setSaldo(3267.00);
        
        // impressão de valores antes da transferência
        System.out.printf("Código do cliente: %d\n", c1.getCodCliente());
        System.out.printf("Saldo inicial em conta: %.2f\n", c1.getSaldo());
        
        // impressão de valores após a transferência
        c1.transferencia(375.00);
        System.out.printf("Saldo final após transferência: %.2f\n", c1.getSaldo());

        System.out.println("--------------------------------");
        // objeto 2  
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setCodCliente(02);
        cc1.setSaldo(10500.00);
        
        // impressão de valores antes da transferência
        System.out.printf("Código do cliente: %d\n", cc1.getCodCliente());
        System.out.printf("Saldo inicial em conta: %.2f\n", cc1.getSaldo());

        // impressão de valores após a transferência
        cc1.transferencia(550.00);
        cc1.transferencia(13.00);
        cc1.transferencia(30.00);
        cc1.transferencia(150.00);
        cc1.transferencia(300.00);

        
        System.out.printf("Taxa sobre transferências: 10,50\n");
        System.out.printf("Após cinco transferências há cobrança de taxa de manutenção: 2,50\n");
        System.out.printf("Saldo após cinco transferências + taxas: %.2f\n", cc1.getSaldo());
        

        System.out.println("+-------------------------------------------------------------------+");
        
    }
    
}
