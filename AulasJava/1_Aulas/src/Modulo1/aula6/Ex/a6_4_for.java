package modulo1.aula6.Ex;

import java.util.Scanner;

public class a6_4_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = " ";
        String sobrenome = " ";

        for (int contador = 1; contador <= 4; contador++) {
            System.out.printf("\nDigite o nome do usuário %dº usuário: ", contador);
            nome = sc.nextLine();

            System.out.printf("Digite o sobrenome do usuário %dº usuário: ", contador);
            sobrenome = sc.nextLine();

            System.out.printf("\nVocê cadastrou o usuário %s %s com sucesso!\n", nome, sobrenome);

        }
    }
}

