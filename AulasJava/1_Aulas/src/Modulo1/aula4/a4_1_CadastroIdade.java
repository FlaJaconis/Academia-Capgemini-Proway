package modulo1.aula4;

import java.util.Scanner;

public class a4_1_CadastroIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tBem-vindo!\n");
        System.out.print("\tDigite o nome do cliente: ");
        String nome = sc.next();
        System.out.print("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();

        if (idade >= 18) {
            System.out.printf("\tO cadastro da(o) cliente %s com %d anos de idade foi realizado sucesso!", nome, idade);

        } else {
            System.out.printf("\tO cadastro da(o) cliente %s, com %d anos de idade não pode ser realizado. " +
                    "Cliente menor de idade!", nome, idade);
        }
    }
}