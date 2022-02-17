package modulo1.aula6.Ex;

import java.util.Scanner;

public class a6_3_semanal {

    public static void main(String[] args) {
        String nome = "";

        boolean valido = true;
        do {
            System.out.println("Digite seu nome: ");
            nome = "May";
            if (nome.length() < 3) {
                System.out.println("O nome deve ter mais do que 3 letras.");
                valido = false;
            }
        }while (!valido);

    }
}