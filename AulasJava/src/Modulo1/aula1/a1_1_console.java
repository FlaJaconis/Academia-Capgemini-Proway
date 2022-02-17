package modulo1.aula1;

import java.util.Scanner;

public class a1_1_console {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
            String nome = sc.next();

        System.out.print("Digite seu sobrenome: ");
         String sobrenome = sc.next();

        System.out.println("O nome e o sobrenome digitados foram: " + nome +" "+ sobrenome);

    }
}
