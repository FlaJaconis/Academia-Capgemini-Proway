package modulo1.aula3;

import java.util.Scanner;

public class cliente {

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================== Cadastro de Clientes =========================\n");
        System.out.println("\tBem-vindo, digite as informações do cliente.");
        System.out.printf("\tDigite o nome do cliente: ");
        String nome = sc.next();
        System.out.printf("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("\tO cliente %s de %d foi cadastrado com sucesso!\n", nome, idade);

    }
}
