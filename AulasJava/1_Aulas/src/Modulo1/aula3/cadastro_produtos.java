package modulo1.aula3;

import java.util.Scanner;

public class cadastro_produtos {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================== Cadastro de Produtos =====================\n");
        System.out.println("\tBem-vindo!\n");
        System.out.print("\tDigite o nome do produto: ");
        String nome = sc.next();
        System.out.print("\tDigite a descrição do produto: ");
        String descricao = sc.next();
        sc.nextLine();
        System.out.print("\tDigite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("\tDigite a categoria do produto: ");
        String categoria = sc.next();
        System.out.println("\n");
        System.out.println("===================== Cadastro Completo =====================");
        System.out.printf("\n\tProduto: %s," +
                          "\n\tDescrição: %s," +
                          "\n\tValor: R$ %f," +
                          "\n\tCategoria: %s, " +
                          "\n\n\tCadastrado realizado com sucesso!\n", nome, descricao, valor, categoria);
    }
}


