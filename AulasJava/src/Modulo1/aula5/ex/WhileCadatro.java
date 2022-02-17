package modulo1.aula5.ex;

import java.util.Scanner;

public class WhileCadatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        boolean invalido = true;

        while (invalido) {
            System.out.println( "Digite o nome do produto: ");
            String nome = sc.nextLine();
            if (nome.length() < 5) {
                System.out.println("O nome deve ter mais que 5 caracteres");
                System.out.println("Digite novamente o nome: ");
            }
            else {
                invalido = false;
            }
        }
    }
}
