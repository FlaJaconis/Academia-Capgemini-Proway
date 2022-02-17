package exerc_revisao.atp16;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        CalculadoraTaxas ct = new CalculadoraTaxas();

        System.out.println("+------------------ SISTEMA DE OPERAÇÕES BANCÁRIAS ------------------+");
        System.out.println("+--------------------------- Bem-vindo(a) ---------------------------+");

        Menu();
        operacao(ct);
        System.out.println("\n+------------------------------------------------------------------+\n");
    }

    static void Menu() {
        System.out.println("\nEscolha a operação desejada: \n1 - transferência \n2 - saque");

    }

    static void operacao(CalculadoraTaxas ct) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nOperação: ");
        int op = Integer.parseInt(sc.nextLine());
        char novoSaque = 'N';

        if (op < 1 || op > 2) {
            System.out.println("\nOpção inválida! Digite uma opção entre 1 e 2.");
            Menu();
            operacao(ct);

        } else {

            System.out.println("\n+------------------ Demonstrativo de transações ------------------+");
            System.out.println("+------------------------- Valores e taxas -----------------------+");
            double valor;
            switch (op) {
                case 1:
                
                    System.out.println("Você escolheu a operação tranferência.");
                    valor = ct.entraValor("\nEntre com o valor da transação: ");
                    double vlr1 = ct.transferir(valor);
                    System.out.printf("\nValor de tranferência: %.2f", valor);
                    System.out.printf("\nValor de tranferência mais taxa de 0,001 por cento: %.4f", vlr1);

                    break;
                case 2:
                    System.out.println("Você escolheu a operação sacar.");
                    do {
                        for (int cont = 0; cont < 15; cont++) {
                            valor = ct.entraValor("\nEntre com o valor da transação: ");
                            double vlr2 = ct.txSaque();
                            System.out.printf(
                                    "\nEsse é o seu no %dº saque no valor de %.2f. Será cobrado %.2f de taxa.",
                                    (cont + 1), valor, vlr2);

                            System.out.println("\nVocê quer fazer um novo depósito? Digite S para Sim ou N para Sair");
                            System.out.println("Opção: ");
                            novoSaque = sc.nextLine().toUpperCase().charAt(0);
                            if (novoSaque == 'N') {
                                System.out.println("Você escolheu sair do Sistema. Obrigado!");
                                return;
                            }
                        }
                        break;
                   } 
                  while (novoSaque == 'S');
            }
        }
    }
}
