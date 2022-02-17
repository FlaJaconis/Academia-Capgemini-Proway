package modulo1.aula5;

import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));


        System.out.println("********** Cadastro de clientes **********");
        System.out.println("\nDigite a opção desejada:" +
                "\n1 - Cadastrar clientes; " +
                "\n2 - Listar clientes; " +
                "\n0 - Sair");

        short opcao = sc.nextShort();
        sc.nextLine();

        switch (opcao) {
            case 0:
                System.out.printf("Sua opção foi %d", opcao);
                System.out.printf("\nSaindo... \n");
                break;
            case 1:
                boolean invalido = true;
                String nome = " ";
                String sobrenome = " ";
                String rg = " ";
                String cpf = " ";
                System.out.printf("Sua opção foi %d", opcao);

                do {
                    System.out.printf("\nDigite o nome do cliente: \n");
                    nome = sc.next();
                    sc.nextLine();
                    if (nome.length() <= 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;

                do {
                    System.out.printf("\nDigite o sobrenome do cliente: \n");
                    sobrenome = sc.next();
                    sc.nextLine();
                    if (sobrenome.length() <= 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;

                do {
                    System.out.printf("\nDigite o rg do cliente: \n");
                    rg = sc.next();
                    sc.nextLine();
                    if (rg.length() < 4) {
                        System.out.println("O RG deve ter mais que 4 caracteres");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;

                do {
                    System.out.printf("\nDigite o cpf do cliente: \n");
                    cpf = sc.next();
                    sc.nextLine();
                    if (cpf.length() < 11) {
                        System.out.println("O CPF deve ter mais que 11 caracteres");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);

                System.out.printf("Você cadastrou o cliente %s %s, RG: %s e CPF: %s! Cadastro realizado com sucesso!",
                        nome, sobrenome, rg, cpf);
                sc.nextLine();
                break;

            case 2:
                System.out.printf("Sua opção foi %d", opcao);
                String listarnome = sc.nextLine();
                System.out.printf("\nListando clientes... \n");
                break;

            default:
                System.out.println("Opção inválida. Digite novamente!");
                break;
        }
    }
}
